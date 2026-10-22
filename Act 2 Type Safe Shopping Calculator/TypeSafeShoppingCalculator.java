/**
 *
 * @author ADMIN
 */
public class TypeSafeShoppingCalculatorWeek1 {
    public static void main(String[] args) {
        int Quant = 5;
        double unitPresyo = 100.10;
        String storeName = "DonBye Store";
        
        double totalCost = Quant * unitPresyo;
        //totalCost shouldn't be an int because it is not entirely a whole number
        
        System.out.println("Shopping Summary");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + Quant);
        System.out.println("Unit Price: " + unitPresyo);
        System.out.println("Total Cost: " + totalCost);
        
        
    }
    
}
