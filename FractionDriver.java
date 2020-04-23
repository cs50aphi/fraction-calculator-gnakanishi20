import java.util.Scanner;

public class FractionDriver
{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(system.in);
        System.out.print("Num1: ");
        int n1 = kb.nextInt();
        System.out.print("Den1: ");
        int d1 = kb.nextInt();
        System.out.print("Num2: ");
        int n2 = kb.nextInt();
        System.out.print("Den2: ");
        int d2 = kb.nextInt();
        Fraction f1 = new Fraction(n1, d1);
        Fraction f2 = new Fraction(n2, d2);
        System.out.print(f1 + " + " + f2 + " is " + f1.add(f2));
        System.out.print(f1 + " - " + f2 + " is " + f1.subtract(f2));
        System.out.print(f1 + " * " + f2 + " is " + f1.multiply(f2));
        System.out.print(f1 + " / " + f2 + " is " + f1.divide(f2));
        System.out.print(f1 + " is the same as " + f2 + ": " + f1.equals(f2));
    }
}