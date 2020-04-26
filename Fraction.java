public class Fraction
{
    int numerator;
    int denominator;
    
    public Fraction(int n, int d)
    {
        if(d < 0)
        {
            n = -n;
            d = d * -1;
            numerator = n;
            denominator = d;
        }
        else if(n < 0 && d < 0)
        {
            n = +n;
            d = +d;
            numerator = n * -1;
            denominator = d * -1;
        }
        else
        {
            numerator = n;
            denominator = d;
        }
        
    }
    
    public Fraction(int n)
    {
        numerator = n;
        denominator = 0;
    }
    
    public Fraction()
    {
        numerator = 0;
        denominator = 1;
    }
    
    public int getNumerator()
    {
        return numerator;
    }
    
    public int getDenominator()
    {
        return denominator;
    }
    
    public String toString()
    {
        String numer = String.valueOf(numerator);
        String denom = String.valueOf(denominator);
        return numer + "/" + denom;
    }
    
    public double toDouble()
    {
        return((double) numerator / denominator);
    }
    
    public Fraction add(Fraction obj)
    {
        int denom2 = obj.getDenominator() * denominator;
        int num2 = obj.getDenominator() * numerator + obj.getNumerator() * denominator;
        //returning a fraction?
        Fraction finalFraction = new Fraction(num2, denom2);
        finalFraction.toLowestTerms();
        return finalFraction;
    }
    
    public Fraction subtract(Fraction obj)
    {
        int denom2 = obj.getDenominator() * denominator;
        // order now matters so the first numerator has to come first
        int num2 = (obj.getDenominator() * numerator) - (obj.getNumerator() * denominator);
        //returning a fraction?
        Fraction finalFraction = new Fraction(num2, denom2);
        finalFraction.toLowestTerms();
        return finalFraction;
    }
    
    public Fraction multiply(Fraction obj)
    {
        int denom2 = obj.getDenominator() * denominator;
        int num2 = numerator * obj.getNumerator();
        Fraction finalFraction = new Fraction(num2, denom2);
        finalFraction.toLowestTerms();
        return finalFraction;
    }
    
    public Fraction divide(Fraction obj)
    {
        int num2 = obj.getDenominator() * numerator;
        int denom2 = denominator * obj.getNumerator();
        Fraction finalFraction = new Fraction(num2, denom2);
        finalFraction.toLowestTerms();
        return finalFraction;
    }
    
    public boolean equals(Fraction obj)
    {
        //makes sure it prints out the real fraction instead of the reduced one
        Fraction simple = new Fraction(obj.getNumerator(), obj.getDenominator());
        simple.toLowestTerms();
        Fraction simple2 = new Fraction(numerator, denominator);
        simple2.toLowestTerms();
        if(simple2.getNumerator() == simple.getNumerator() && simple2.getDenominator() == simple.getDenominator())
        {
            return true;
        }
        return false;
    }
    
    public void toLowestTerms()
    {
        int divide = gcd(numerator, denominator);
        numerator = numerator / divide;
        denominator = denominator / divide;
    }
    
    public static int gcd(int a, int b)
    {
        if(a % b == 0)
        {
            return b;
        }
        return gcd(b, a % b);
    }
}