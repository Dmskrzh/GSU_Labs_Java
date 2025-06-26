import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class ThreadGenerator {
    private int threadCount;
    private String operation;
    private int lowerBound;
    private int upperBound;
    private BigInteger finalResult;

    public ThreadGenerator(int threadCount, String operation, int lowerBound, int upperBound) {
        this.threadCount = threadCount;
        this.operation = operation;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public void execute() {
        List<CalculatorThread> threads = new ArrayList<>();

        int rangeSize = (upperBound - lowerBound + 1) / threadCount;

        for (int i = 0; i < threadCount; i++) {
            int start = lowerBound + i * rangeSize;
            int end = (i == threadCount - 1) ? upperBound : start + rangeSize - 1;

            CalculatorThread thread = new CalculatorThread(start, end);
            threads.add(thread);
            thread.start();
        }

        for (CalculatorThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
            }
        }

        finalResult = threads.get(0).getResult();

        for (int i = 1; i < threads.size(); i++) {
            BigInteger threadResult = threads.get(i).getResult();

            if (operation.equals("сложение")) {
                finalResult = finalResult.add(threadResult);
            } else if (operation.equals("вычитание")) {
                finalResult = finalResult.subtract(threadResult);
            } else if (operation.equals("умножение")) {
                finalResult = finalResult.multiply(threadResult);
            }
        }
    }

    public BigInteger getResult() {
        return finalResult;
    }
}