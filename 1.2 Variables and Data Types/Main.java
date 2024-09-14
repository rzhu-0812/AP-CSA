public class Main {
    public static void main(String[] args) {
        // primitive types
        int i = 10;        // integer
        double d = 5.5;    // double (decimal)
        boolean b = true;  // boolean
 
        // reference type
        String s = "Hello, World!"; // string
 
        // operator with int and double
        double sum = i + d; // add int and double
 
        // update value stored in var
        i = 20; // update i to 20
 
        // final variable
        final double GRATIO = 1.61803; // constant value of golden ratio
 
        System.out.println("Updated Integer Value: " + i);
        System.out.println("Double Value: " + d);
        System.out.println("Boolean Value: " + b);
        System.out.println("String Value: " + s);
        System.out.println("Result of i + d: " + sum);
        System.out.println("Value of golden ratio: " + GRATIO);
    }
}