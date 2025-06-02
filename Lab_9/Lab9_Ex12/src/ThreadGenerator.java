import java.math.BigInteger;
import java.util.concurrent.CountDownLatch;

class ThreadGenerator {
    private int threadCount;
    private String operation;
    private int minBound;
    private int maxBound;
    private CalculatorThread[] threads;
    private BigInteger finalResult;

    public ThreadGenerator(int threadCount, String operation, int minBound, int maxBound) {
        this.threadCount = threadCount;
        this.operation = operation;
        this.minBound = minBound;
        this.maxBound = maxBound;
        this.threads = new CalculatorThread[threadCount];
    }

    public void execute() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(threadCount);

        for (int i = 0; i < threadCount; i++) {
            int a = minBound + (i * (maxBound - minBound + 1)) / threadCount;
            threads[i] = new CalculatorThread(a, latch);
            threads[i].start();
        }

        latch.await();
        groupResults();
    }

    private void groupResults() {
        finalResult = threads[0].getResult();

        for (int i = 1; i < threads.length; i++) {
            switch (operation) {
                case "сложение":
                    finalResult = finalResult.add(threads[i].getResult());
                    break;
                case "вычитание":
                    finalResult = finalResult.subtract(threads[i].getResult());
                    break;
                case "умножение":
                    finalResult = finalResult.multiply(threads[i].getResult());
                    break;
            }
        }
    }

    public BigInteger getResult() {
        return finalResult;
    }
}