public class Fraction
{
    int numerator;
    int denominator;
    
    public Fraction(int n1, int d1)
    {
        if(int d1 < 0)
        {
            numerator = n1 * -1;
            denominator = d1 * -1;
        }
        else
        {
            numerator = n1;
            denominator = d1;
        }
    }
    
    public Fraction(int n1)
    {
        numerator = n1;
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
        String numer = String.valueof(numerator);
        String denom = String.valueof(denominator);
        return numer + "/" + denom;
    }
    
    public double toDouble()
    {
        return((double) numerator / denominator);
    }
    
    
}