import java.util.Scanner;

public class FractionDriver
{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter an operation (+, -, *, /, =, or Q to Quit):");
        String operation = getOperation(kb.nextLine());
        System.out.println("Please enter a fraction (a/b) or interger (a):");
        String fraction = kb.nextLine();
        String []hold = fraction.split("/");
        Fraction f1 = new Fraction(hold[0], hold[1]);
        System.out.println("Please enter a fraction (a/b) or interger (a):");
        String fraction1 = kb.nextLine();
        String []hold1 = fraction1.split("/");
        Fraction f2 = new Fraction(hold1[0], hold1[1]);
        switch (operation)
        {
            case "+":
            {
                System.out.println(f1 + " + " + f2 + " is " + f1.add(f2));
            }
            
            case "-":
            {
                System.out.println(f1 + " - " + f2 + " is " + f1.subtract(f2));
            }
            
            case "*":
            {
                System.out.println(f1 + " * " + f2 + " is " + f1.multiply(f2));
            }
            
            case "/":
            {
                System.out.println(f1 + " / " + f2 + " is " + f1.divide(f2));
            }
            
            case "Q":
            case "q":
            {
                System.out.println("Goodbye!");
            }
        }
    }
    
    public static String getOperation(String opper)
    {
        String input = "+, -, /, *, q, Q, =";
        while(!input.contains(opper))
            {
                System.out.println("Invalid input (+, -, *, /, =, or Q to Quit):");
                // String inputRow = kb.nextLine();
                opper = kb.nextLine();
            }
        
        return opper;
    }
    
    public static boolean validFraction(String fraction)
    {
        
    }
    
    public static Fraction getFraction(String frac)
    {
        
    }
}