class Cart{
    String itemName;
    double itemPrice;
    double quantity;
    double Total;
    double Discounted;
    
    Cart(String i, double p, double q){
        itemName = i;
        itemPrice = p;
        quantity = q;
    }
    
    double calculateTotal(){
        Total = itemPrice * quantity;
        return Total;
    }
    
    double calculateDiscountedTotal(double discountPercent){
        Discounted = Total - Total*discountPercent/100;
        return Discounted;
    }
    
    void displayCart(){
        System.out.println("You got: " +itemName);
        System.out.println(itemName + " costs:Rs" +itemPrice);
        System.out.println("You got "+ quantity + " " + itemName);
        System.out.println("Your total before discount is:Rs"+Total);
        System.out.println("Your total is:Rs" + Discounted);
    }
}

public class ShoppingApp{
    public static void main(String[] args){
        Cart a = new Cart("Juice",2,4);
        a.calculateTotal();
        a.calculateDiscountedTotal(2);
        a.displayCart();        
    }
}