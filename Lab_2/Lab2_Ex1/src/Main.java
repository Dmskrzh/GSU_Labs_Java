public class Main {
    public static void main(String[] args) {
        Stock[] stocks = {
                new Stock("Item1", 10.0, 5),
                new Stock("Item2", 20.0, 3),
                new Stock("Item3", 15.0, 7)
        };

        double totalValue = Stock.calculateTotalValue(stocks);
        int totalQuantity = Stock.calculateTotalQuantity(stocks);

        System.out.println("Общая стоимость товаров: " + totalValue);
        System.out.println("Общее количество товаров: " + totalQuantity);
    }
}
