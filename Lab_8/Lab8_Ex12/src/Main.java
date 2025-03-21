import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Cylinder> cylinders = new ArrayList<>();

        Cylinder cylinder1 = new Cylinder(20, 25);
        Cylinder cylinder2 = new Cylinder(40, 30);
        Cylinder cylinder3 = new Cylinder(50F, 8.5F);
        Cylinder cylinder4 = new Cylinder(60.8F, 10);
        Cylinder cylinder5 = new Cylinder(40, 55);

        try (FileWriter writer = new FileWriter("cylinders.txt")) {
            writer.write(cylinder1.height + ","+ cylinder1.radius + "\n");
            writer.write(cylinder2.height + ","+ cylinder2.radius + "\n");
            writer.write(cylinder3.height + ","+ cylinder3.radius + "\n");
            writer.write(cylinder4.height + ","+ cylinder4.radius + "\n");
            writer.write(cylinder5.height + ","+ cylinder5.radius + "\n");
            System.out.println("Информация о цилиндрах успешно записана.");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("cylinders.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                float height = Float.parseFloat(parts[0].trim());
                float radius = Float.parseFloat(parts[1].trim());
                cylinders.add(new Cylinder(height, radius));
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }

        Collections.sort(cylinders);
        
        try (PrintWriter pw = new PrintWriter(new FileWriter("cylinders_sorted.txt"))) {
            for (Cylinder cylinder : cylinders) {
                pw.println(cylinder.toString());
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
        }

        System.out.println("Цилиндры отсортированы");
    }
}