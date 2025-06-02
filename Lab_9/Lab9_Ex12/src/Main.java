public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGenerator generator = new ThreadGenerator(2, "умножение", 1, 2);
        generator.execute();
        System.out.println("Результат: " + generator.getResult());
    }
}