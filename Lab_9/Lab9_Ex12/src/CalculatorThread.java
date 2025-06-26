import java.math.BigInteger;

class CalculatorThread extends Thread {
    private int start;
    private int end;
    private BigInteger result;

    public CalculatorThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.result = BigInteger.ONE;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 1) {
                result = result.multiply(BigInteger.valueOf(i));
            }
        }
        System.out.println("Поток [" + start + "-" + end + "] завершен");
    }

    public BigInteger getResult() {
        return result;
    }
}