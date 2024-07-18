// 3. Create a Shopping Cart class to simulate an online shopping cart. The class should have the following attributes: cart ID, customer name, and items (a list of products). 
// Include methods to addItem(), removeltem(), and calculate Total(). Implement functionality to create new shopping carts, add/remove items, and 
// calculate the total cost of items in the cart.
import java.util.ArrayList;
import java.util.List;

public class Task3{
    public static void main(String[] args) {
        // Example usage
        ShoppingCart cart = new ShoppingCart(1, "Nischay Maharjan");
        
        cart.addItem("Apple", 100);
        cart.addItem("Banana", 120);
        cart.addItem("Orange", 200);
        
        cart.displayCart();
        
        cart.removeItem("Banana");
        
        cart.displayCart();
    }
}

class ShoppingCart {
    private int cartID;
    private String customerName;
    private List<String> items;
    private List<Double> prices;
    
    public ShoppingCart(int cartID, String customerName) {
        this.cartID = cartID;
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
    }
    
    public void addItem(String name, double price) {
        items.add(name);
        prices.add(price);
        System.out.println(name + " added to the cart.");
    }
    
    public void removeItem(String name) {
        int index = items.indexOf(name);
        if (index != -1) {
            items.remove(index);
            prices.remove(index);
            System.out.println(name + " removed from the cart.");
        } else {
            System.out.println(name + " not found in the cart.");
        }
    }
    
    public double calculateTotal() {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }
    
    public void displayCart() {
        System.out.println("\nShopping Cart ID: " + cartID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Items in the cart:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i) + ": Rs." + prices.get(i));
        }
        System.out.println("Total: Rs." + calculateTotal());
    }
    
    
}
