public class Inventory {
    private int quantityInStock;

    public Inventory(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public boolean hasEnoughStock(int requestedQty) {
        return quantityInStock >= requestedQty;
    }

    public void reduceStock(int quantity) {
        if (hasEnoughStock(quantity)) {
            quantityInStock -= quantity;
            System.out.println("Stock reduced. Remaining: " + quantityInStock);
        } else {
            System.out.println("Not enough stock!");
        }
    }
}

