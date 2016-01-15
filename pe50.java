import java.math.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class pe50
{
	public static void main(String args[]) throws IOException
	{
		ArrayList<BigInteger> primeList = NumberTheory.primeList(1000000);
		BigInteger sum = BigInteger.ZERO;
		for(int size = 550;size>0;size--)
		{
			for(int position = 0;sum.compareTo(new BigInteger(""+1000000))<0;position++)
			{
				sum = BigInteger.ZERO;
				for(int x = position; x<position+size;x++)
				{
					sum = sum.add(primeList.get(x));
				}
				if(NumberTheory.isPrime(sum) && sum.compareTo(new BigInteger(""+1000000))<0)
				{
					out.println(sum);
					System.exit(0);
				}
			}
			sum = BigInteger.ZERO;
		}
	}
}