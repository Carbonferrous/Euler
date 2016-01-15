import java.math.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class pe16
{
	public static void main(String args[])
	{
		BigInteger n = BigInteger.ONE;
		BigInteger sum = BigInteger.ZERO;
		n = n.add(BigInteger.ONE);
		n = n.pow(1000);
		for(int x = 0;x<n.toString().length();x++)
		{
			sum = sum.add(new BigInteger(n.toString().substring(x,x+1)));
		}
		out.println(sum);
	}
}