import java.math.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class pe71
{
	public static void main(String args[]) throws IOException
	{
		int d = 1000000;
		Fraction med = new Fraction(1,1);
		Fraction pin = new Fraction(3,7);
		Fraction move = new Fraction(2,5);
		int x = 0;
		while(x<=d)
		{
			med = pin.mediant(move);
			if(med.getDenominator().compareTo(new BigInteger(""+x))<=0)
				move = med;
			x++;
		}
		out.println(move);
		
	}
}