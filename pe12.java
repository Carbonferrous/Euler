import java.math.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class pe12
{
	public static void main(String args[]) throws IOException
	{
		BigInteger x = BigInteger.ONE;
		BigInteger FIVEHUNDRED = new BigInteger("500");
		BigInteger TWO = new BigInteger("2");
		while(NumberTheory.numDivisors(x.multiply(x.add(BigInteger.ONE).divide(TWO))).compareTo(FIVEHUNDRED)<=0)
			x = x.add(BigInteger.ONE);
		out.println(x.multiply(x.add(BigInteger.ONE).divide(TWO)));
		out.println(NumberTheory.numDivisors(x.multiply(x.add(BigInteger.ONE).divide(TWO))));
	}
}