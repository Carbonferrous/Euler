import java.math.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import static java.lang.Math.*;
import static java.lang.System.*;

class Fraction
{
	BigInteger numerator;
	BigInteger denominator;
	//*************Set Up*************
	public Fraction(BigInteger n, BigInteger d)
	{
		numerator = n;
		denominator = d;
		simplify();
	}
	public Fraction(int n, int d)
	{
		numerator = new BigInteger(""+n);
		denominator = new BigInteger(""+d);
		simplify();
	}
	public void simplify()
	{
		if(denominator.equals(BigInteger.ZERO))
		{
			out.println("ERROR "+numerator+"/"+denominator+": DIVIDE BY 0");
			out.println("Normalizing denominator to 1");
			denominator = BigInteger.ONE;
		}
		if(denominator.signum()==-1)
		{
			denominator = denominator.multiply(BigInteger.ONE.negate());
			numerator = numerator.multiply(BigInteger.ONE.negate());
		}
		BigInteger gcd = numerator.gcd(denominator);
		numerator = numerator.divide(gcd);
		denominator = denominator.divide(gcd);
	}
	//*************Calculations*************
	public void abs()
	{
		numerator.abs();
		denominator.abs();
	}
	public void add(Fraction f)
	{
		return new Fraction((numerator.multiply(f.getDenominator())).add(f.getNumerator().multiply(denominator)),denominator.multiply(f.getDenominator()));
	}
	public void subtract(Fraction f)
	{
		return this.add(f.negate());
	}
	public void multiply(Fraction f)
	{
		return new Fraction(numerator.multiply(f.getNumerator()),denominator.multiply(f.getDenominator()));
	}
	public void divide(Fraction f)
	{
		return this.multiply(f.inverse());
	}
	public Fraction negate()
	{
		return new Fraction(numerator.negate(),denominator);
	}
	public Fraction inverse()
	{
		return new Fraction(denominator,numerator);
	}
	public void pow(int e)
	{
		return new Fraction(numerator.pow(e),denominator.pow(e));
	}
//	public Fraction max(Fraction f)
//	{
//		
//	}
//	public Fraction min(Fraction f)
//	{
//		
//	}
	public Fraction mediant(Fraction f)
	{
		return new Fraction(numerator.add(f.getNumerator()),denominator.add(f.getDenominator()));
	}
	//*************Math*************
	public static ArrayList<Fraction> fareySeq(int d)
	{
		ArrayList<Fraction> sequence = new ArrayList<Fraction>();
		Fraction med = new Fraction(1,1);
		sequence.add(new Fraction(1,3));
		sequence.add(new Fraction(1,2));
		for(int x=0;x<=d;x++)
		{
			for(int y=0;y<sequence.size()-1;y++)
			{
				med = sequence.get(y).mediant(sequence.get(y+1));
				if(med.getDenominator().compareTo(new BigInteger(""+x))<=0)
					sequence.add(y+1,med);
			}
		}
		return sequence;
	}
//	public static int[] continuedFrac(int size)
//	{
//		
//	}
	//*************Testing*************
	public int compareTo(Fraction f)
	{
		return numerator.multiply(f.getDenominator()).compareTo(f.getNumerator().multiply(denominator));
	}
	public boolean equals(Fraction f)
	{
		return this.compareTo(f)==0;
	}
	public int sign()
	{
		return this.compareTo(new Fraction(0,1));
	}
	//*************Output*************
	public BigInteger getNumerator()
	{
		return numerator;
	}
	public BigInteger getDenominator()
	{
		return denominator;
	}
	public double doubleVal()
	{
		return numerator.doubleValue()/denominator.doubleValue();
	}
	public BigInteger[] properFrac()
	{
		BigInteger[] prop = new BigInteger[3];
		prop[0] = numerator.divide(denominator);
		prop[1] = numerator.remainder(denominator);
		prop[2] = denominator;
		return prop;
	}
	public String properFracString()
	{
		return ""+numerator.divide(denominator)+" "+numerator.remainder(denominator)+"/"+denominator;
	}
	public String toString()
	{
		return ""+numerator+"/"+denominator;
	}
}