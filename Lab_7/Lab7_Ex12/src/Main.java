import exceptions.InvalidAgeException;
import exceptions.MissingRecordException;
import exceptions.InsufficientMemoryException;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager[] managers = null;

        try {
            System.out.print("Введите количество управляющих: ");
            int n = scanner.nextInt();
            scanner.nextLine();

            if (n < 1) {
                throw new InsufficientMemoryException("Недостаточно памяти для создания массива управляющих.");
            }

            managers = new Manager[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Введите имя управляющего: ");
                String name = scanner.nextLine();
                System.out.print("Введите возраст управляющего: ");
                int age = scanner.nextInt();
                System.out.print("Управляющий справляется с обязанностями? (true/false): ");
                boolean copes = scanner.nextBoolean();
                scanner.nextLine();

                if (age < 0) {
                    throw new InvalidAgeException("Возраст не может быть отрицательным.");
                }

                managers[i] = new Manager(name, age, copes);
            }

            if (managers.length == 0) {
                throw new MissingRecordException("Не удалось записать управляющих, запись отсутствует.");
            }

            try (FileOutputStream outputStream = new FileOutputStream("managers.ser");
                 ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
                objectOutputStream.writeObject(managers);
            }

            try (FileInputStream fileInputStream = new FileInputStream("managers.ser");
                 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                managers = (Manager[]) objectInputStream.readObject();
            }

            float avrAge = Manager.calculateAvrAge(managers);
            int copeAmount = Manager.calculatecopeAmount(managers);

            System.out.println("Cредний возраст управляющих: " + avrAge);
            System.out.println("Количество управляющих, которые справляются с обязанностями: " + copeAmount);

        } catch (InvalidAgeException | InputMismatchException e) {
            System.err.println("Ошибка ввода: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        } catch (InsufficientMemoryException e) {
            System.err.println("Недостаточно памяти: " + e.getMessage());
        } catch (MissingRecordException e) {
            System.err.println("Запись отсутствует: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка ввода/вывода: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Класс не найден: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Ошибка в вычислении: " + e.getMessage());
        }
    }
}
