/**
 *
 * @author ADMIN
 */
public class UnitCastingConverterWeek1 {
    public static void main(String[] args) {
        double cm = 345.45;
        
        int meters = (int) (cm / 100);
        double remainingCM = cm - (meters * 100);
        
        System.out.println("Unit Casting Converter");
        System.out.println("Total Centimeters: " + cm);
        System.out.println("Whole meters: " + meters);
        System.out.println("Remaining Centimeters: " + remainingCM);
        
        
        int num = 25;
        double windenedNum = num;
        
        //no need to cast because double can store all the int values
        System.out.println("\nImplict Widening:");
        System.out.println("Integer: " + num);
        System.out.println("Double: " + windenedNum);
        
        double decimalNum = 15.20;
        int narrowedNum = (int) decimalNum;
        
        //The .20(decimaal) is lost when turning into double to int
        System.out.println("\nExplicit Narrowing:");
        System.out.println("Double: " + decimalNum);
        System.out.println("Integer: " + narrowedNum);
    }
    
}
