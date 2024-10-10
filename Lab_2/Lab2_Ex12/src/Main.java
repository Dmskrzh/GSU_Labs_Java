public class Main {
    public static void main(String[] args) {
        Manager[] managers = {
                new Manager("Скрежендевский", 18, true),
                new Manager("Воробьёв", 31, false),
                new Manager("Иванов", 52, true)
        };

        float avrAge = Manager.calculateAvrAge(managers);
        int copeAmount = Manager.calculatecopeAmount(managers);

        System.out.println("Cредний возраст управляющих: " + avrAge);
        System.out.println("Количество управляющих, которые справляются с обязанностями: " + copeAmount);
    }
}