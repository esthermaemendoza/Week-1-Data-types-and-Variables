/**
 *
 * @author ADMIN
 */
public class OverFlowReferenceInvestigatorWeek1 {

    public static void main(String[] args) {
        
        byte num = 125;
        num++;
        
        System.out.println("Primitive Overflow");
        System.out.println("Byte after increment: " + num);
        
        String string1 = new String("Java");
        String string2 = new String("Java");
        String string3 = "Java";
        
        System.out.println("\nString Comparison");
        
        System.out.println("string1 == string2 :" +(string1 == string2));
        //false because string1 and string2 refer to different objects
        
        System.out.println("string1.equals(string2): " + string1.equals(string2));
        
        System.out.println("string1 == string3: " +(string1 == string3));
        //false cause string1 and the String literal are separate objects
        
        System.out.println("string1.equals(string3):" + string1.equals(string3));
        
        System.out.println("string2 == string3:" + (string2 == string3));
        //false cause string2 refers to a different object from the String literal
        
        System.out.println("string2.equals(string3):" + string2.equals(string3));
        
        int[] array1 = {18,19,20};
        int[] array2 = array1;
        
        array2[0] = 100;

        
        System.out.println("Shared Array Reference");
        System.out.println("Array1 first element: " + array1[0]);
        System.out.println("Array2 first element: " + array2[0]);
        System.out.println("");
        
    }
    
}
