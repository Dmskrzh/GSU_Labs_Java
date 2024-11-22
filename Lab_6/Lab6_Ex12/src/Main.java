import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество управляющих: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Manager[] managers = new Manager[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите имя управляющего: ");
            String name = scanner.nextLine();
            System.out.print("Введите возраст управляющего: ");
            int age = scanner.nextInt();
            System.out.print("Управляющий справляется с обязанностями? (true/false): ");
            boolean copes = scanner.nextBoolean();
            scanner.nextLine();

            managers[i] = new Manager(name, age, copes);
        }

        FileOutputStream outputStream = new FileOutputStream("managers.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(managers);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("managers.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Manager[] deserializedManagers = (Manager[]) objectInputStream.readObject();
        objectInputStream.close();

        float avrAge = Manager.calculateAvrAge(deserializedManagers);
        int copeAmount = Manager.calculatecopeAmount(deserializedManagers);

        System.out.println("Cредний возраст управляющих: " + avrAge);
        System.out.println("Количество управляющих, которые справляются с обязанностями: " + copeAmount);
    }
}