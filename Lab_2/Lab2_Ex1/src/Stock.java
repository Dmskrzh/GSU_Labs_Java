public class Stock {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    public Stock(String itemName, double itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public static double calculateTotalValue(Stock[] stocks) {
        double totalValue = 0;
        for (Stock stock : stocks) {
            totalValue += stock.getItemPrice() * stock.getItemQuantity();
        }
        return totalValue;
    }

    public static int calculateTotalQuantity(Stock[] stocks) {
        int totalQuantity = 0;
        for (Stock stock : stocks) {
            totalQuantity += stock.getItemQuantity();
        }
        return totalQuantity;
    }
}
