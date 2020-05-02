import java.util.Scanner;

public class FractionDriver
{
    public static void main(String [] args)
    {
        boolean stop = false;
        Scanner kb = new Scanner(System.in);
        while(!stop)
        {
            String opperation = getOperation(kb);
            Fraction f1 = getFraction(kb);
            Fraction f2 = getFraction(kb);
            
            if(opperation.equals("+"))
            {
                System.out.println(f1 + " + " + f2 + " is " + f1.add(f2));
            }
            
            if(opperation.equals("-"))
            {
                System.out.println(f1 + " - " + f2 + " is " + f1.subtract(f2));
            }
            
            if(opperation.equals("*"))
            {
                System.out.println(f1 + " * " + f2 + " is " + f1.multiply(f2));
            }
            
            if(opperation.equals("/"))
            {
                System.out.println(f1 + " / " + f2 + " is " + f1.divide(f2));
            }
            
            if(opperation.equals("q") || opperation.equals("Q"))
            {
                System.out.println("Goodbye!");
                stop = true;
            }
        }
    }
    
    public static String getOperation(Scanner kb)
    {
        System.out.print("Please enter an operation (+, -, *, /, =, or Q to Quit):");
        String operation = kb.nextLine();
        String input = "+, -, /, *, q, Q, =";
        while(!input.contains(operation))
            {
                System.out.println("Invalid input (+, -, *, /, =, or Q to Quit):");
                // String inputRow = kb.nextLine();
                operation = kb.nextLine();
            }
        
        return operation;
    }
    
    public static boolean validFraction(String fraction)
    {
        if(fraction.substring(1, fraction.length()).contains("-"))
        {
            return false;
        }
        String remove = fraction.replaceAll("[0-9]", "");
        if(remove.equals("/") || remove.isEmpty())
        {
            return true;
        }
        return false;
    }
    
    public static Fraction getFraction(Scanner kb)
    {
        System.out.println("Please enter a fraction (a/b) or interger (a):");
        String frac = kb.nextLine();
        boolean valid = validFraction(frac);
        do
        {
            System.out.println("Invalid fraction. Please enter (a/b) or (a) where a and b are integers and b is not zero:");
            frac = kb.nextLine();
            valid = validFraction(frac);
        }
        while(valid = false);
        int counter = 0;
        if(frac.contains("/"))
        {
            do
            {
                counter++;
            }
            while(!frac.substring(counter, counter + 1).equals("/"));
            String num = frac.substring(0, counter);
            String denom = frac.substring(counter + 1, frac.length());
            return new Fraction(Integer.parseInt(num), Integer.parseInt(denom));

        }
        else
        {
            String num = frac;
            return new Fraction(Integer.parseInt(num));
        }
    }
}