import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Welome to my calculator!");
        System.out.print("Enter your first number: ");
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        System.out.print("What operation would you like to do ( + , - , * , / , % )? ");
        String operation = s.next();
        System.out.print("Enter your second number: ");
        int second = s.nextInt();
        System.out.println();
        
        switch (operation) {
            case "+": System.out.println("Your answer is: " + (first + second)); break;
            case "-": System.out.println("Your answer is: " + (first - second)); break;
            case "*": System.out.println("Your answer is: " + (first * second)); break;
            case "/": System.out.println(second == 0 ? "Can't divide by zero" : "Your answer is: " + (first / second)); break;
            case "%": System.out.println("Your answer is: " + (first % second)); break;
            default: System.out.println("Invalid Operation"); break;
        }

        s.close();
    }
}