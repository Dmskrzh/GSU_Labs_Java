public class Main {
    public static void main(String[] args) {
        Film pussInBoots = new Cartoon("Кот в сапогах", "Крис Миллер", 90, "E", "Уолтер Крейн", "3D");
        Film lalaLand = new Musical("Ла-Ла Ленд", "Дэмьен Шазелл", 128, "PG-13", "Piano", 6);
        Film schindlersList = new Historical("Список Шиндлера", "Стивен Спилберг", 197, "R", "ХХ век", "средняя");

        pussInBoots.printInfo();
        lalaLand.printInfo();
        schindlersList.printInfo();
    }
}