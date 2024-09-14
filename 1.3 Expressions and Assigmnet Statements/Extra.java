import java.util.ArrayList;
import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
        while (true) {
            System.out.print("\033[2H\033[2J");
            System.out.flush();   // First two lines clear terminal
            System.out.println("Welcome to my equation solver!");
            System.out.println("This program allows you to solve mathematical expressions using basic operators.");
            System.out.println("Please ensure each number and operator is separated by a space.");
            System.out.println("Supported operators: + (addition), - (subtraction), * (multiplication), / (division), % (modulus)");
            System.out.println("Example: 3 + 6 / 7 * 32");  // Intro
            System.out.print("\nEnter your equation: ");

            Scanner s = new Scanner(System.in);

            String equation = s.nextLine();
            ArrayList<Character> symbols = new ArrayList<>();
            ArrayList<Double> nums = new ArrayList<>();
            
            String[] charNums = equation.split("\\s+");  // Splits string around spaces, and puts all numbers and operators in an array

            // Seperates each character or number into its appropriate ArrayList
            for (String charNum : charNums) {
                if (charNum.equals("+") || charNum.equals("-") || charNum.equals("*") || charNum.equals("/") || charNum.equals("%")) {
                    char c = charNum.charAt(0);
                    symbols.add(c);
                }
                else {
                    double d = Double.parseDouble(charNum);
                    nums.add(d);
                }
            }
            
            // Since multiplication, division and mod comes before add/subtract, calculate those first
            for (int i = 0; i < nums.size() - 1; i++) {
                if (symbols.get(i).equals('*') || symbols.get(i).equals('/') || symbols.get(i).equals('%')) {
                    double left = nums.get(i);
                    double right = nums.get(i + 1);
                    if (right == 0 && symbols.get(i).equals('/')) {
                        s.close();
                        throw new ArithmeticException("You cannot divide by 0");
                    }
                    double result = mathOp(symbols.get(i), left, right);
                    nums.set(i, result);
                    nums.remove(i + 1);
                    symbols.remove(i);
                    i--;
                }
            }
            
            // Loops through again to calculate addition and subtraction
            for (int i = 0; i < nums.size() - 1; i++) {
                double left = nums.get(i);
                double right = nums.get(i + 1);
                double result = mathOp(symbols.get(i), left, right);
                nums.set(i, result);
                nums.remove(i + 1);
                symbols.remove(i);
                i--;
            }

            System.out.println("Your answer is: " + nums.get(0));

            System.out.print("\nDo you want to enter anther equation (y/n)? ");
            String again = s.nextLine();

            if (again.equals("y")) {
                continue;
            } else {
                s.close();
                break;
            }
        }
    }

    public static double mathOp(char operation, double num1, double num2) {
        // Function to do operations
        switch (operation) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num1 / num2;
            case '%': return num1 % num2;
        }
        return 0;
    }
}