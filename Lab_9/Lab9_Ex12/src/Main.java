import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        int a = 3;
        int threadCount = 3;
        String operation = "умножение";

        int targetNumber = 2 * a + 1;
        System.out.println("Вычисление (" + targetNumber + ")!");
        System.out.println("Количество потоков: " + threadCount);
        System.out.println("Операция: " + operation);

        ThreadGenerator generator = new ThreadGenerator(threadCount, operation, 1, targetNumber);

        System.out.println("Запуск вычислений...");
        generator.execute();

        BigInteger result = generator.getResult();
        System.out.println("Результат: " + result);
    }
}