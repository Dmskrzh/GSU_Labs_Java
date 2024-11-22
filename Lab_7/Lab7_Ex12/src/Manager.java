import java.io.Serializable;
import exceptions.InvalidAgeException;

public class Manager implements Serializable {
    private static final long serialVersionUID = 1L;
    private String surname;
    private int age;
    private boolean isCope;

    public Manager(String managerSurname, int managerAge, boolean managerIsCope) throws InvalidAgeException {
        if (managerAge < 0 || managerAge > 120) {
            throw new InvalidAgeException("Возраст должен быть в диапазоне от 0 до 120 лет.");
        }
        this.surname = managerSurname;
        this.age = managerAge;
        this.isCope = managerIsCope;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean getCope() {
        return isCope;
    }

    public static float calculateAvrAge(Manager[] managers) throws ArithmeticException {
        int ageSum = 0, amount = 0;
        for (Manager manager : managers) {
            ageSum += manager.getAge();
            amount++;
        }
        return (float) ageSum / amount;
    }

    public static int calculatecopeAmount(Manager[] managers) {
        int copeAmount = 0;
        for (Manager manager : managers) {
            if (manager.getCope()) copeAmount++;
        }
        return copeAmount;
    }
}
