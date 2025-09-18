class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        if (quantity >= qty) quantity -= qty;
        else quantity = 0;
    }

    double calculateTotal() {
        return price * quantity;
    }

    void displayCart() {
        System.out.println("Item: " + itemName + ", Quantity: " + quantity + ", Total: " + calculateTotal());
    }

    public static void main(String[] args) {
        CartItem c1 = new CartItem("Shoes", 2000, 1);
        c1.displayCart();
        c1.addItem(2);
        c1.displayCart();
        c1.removeItem(1);
        c1.displayCart();
    }
}
