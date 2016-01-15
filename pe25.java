import java.io.*;
import java.awt.*;
import java.util.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Math.*;
//4782
public class pe25
{
	public static void main(String args[])
	{
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ONE;
		BigInteger c = BigInteger.ONE;
		int count = 1;
		
		while(b.toString().length()<1000)
		{
			out.println(b.toString());
			c=a.add(b);
			a=b;
			b=c;
			count++;
		}
		out.println("count = "+count);
	}
	public static void fib(BigInteger a, BigInteger b)
	{

	}
}
