public class Manager {
    private String surname;
    private int age;
    private boolean isCope;

    public Manager(String managerSurname, int managerAge, boolean managerIsCope) {
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

    public static float calculateAvrAge(Manager[] managers) {
        int ageSum = 0, amount = 0;
        float avrAge = 0;
        for (Manager manager : managers) {
            ageSum += manager.getAge();
            amount++;
        }
        avrAge = (float) ageSum / amount;
        return avrAge;
    }

    public static int calculatecopeAmount(Manager[] managers) {
        int copeAmount = 0;
        for (Manager manager : managers) {
            if (manager.getCope())
                copeAmount++;
        }
        return copeAmount;
    }
}