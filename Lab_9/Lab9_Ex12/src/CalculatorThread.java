import java.math.BigInteger;
import java.util.concurrent.CountDownLatch;

class CalculatorThread extends Thread {
    private final int n;
    private BigInteger result;
    private final CountDownLatch latch;

    public CalculatorThread(int n, CountDownLatch latch) {
        this.n = n;
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Поток " + Thread.currentThread().getName() + " вычисляет для n=" + n);
        int oddNumber = 2 * n + 1;
        result = calculateFactorial(oddNumber);
        System.out.println("Поток " + Thread.currentThread().getName() + " завершил вычисления: " +
                oddNumber + "!! = " + result);
        latch.countDown();
    }

    private BigInteger calculateFactorial(int n) {
        long factorial1 = 1;
        BigInteger factorial2 = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial1 = factorial1*i;
        }
        for (int i = 2; i <= factorial1; i++) {
            factorial2 = factorial2.multiply(BigInteger.valueOf(i));
        }
        return factorial2;
    }

    public BigInteger getResult() {
        return result;
    }

    public int getN() {
        return n;
    }
}