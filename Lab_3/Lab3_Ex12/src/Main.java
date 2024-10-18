public class Main {
    public static void main(String[] args) {
        Movie cartoon = new Cartoon("Кот в сапогах", "Крис Миллер", 90, "E", "Уолтер Крейн", "3D");
        Movie musical = new Musical("Ла-Ла Ленд", "Дэмьен Шазелл", 128, "PG-13", "Piano", 6);
        Movie historical = new Historical("Список Шиндлера", "Стивен Спилберг", 197, "R", "ХХ век", "средняя");

        System.out.println(cartoon.title());
        System.out.println(musical.title());
        System.out.println(historical.title());
    }
}