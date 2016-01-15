import java.math.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class pe20
{
	public static void main(String args[])
	{
		BigInteger n = BigInteger.ONE;
		BigInteger sum = BigInteger.ZERO;
		for(int x = 100;x>0;x--)
		{
			n = n.multiply(new BigInteger(""+x));
		}
		for(int i = 0;i<n.toString().length();i++)
		{
			sum = sum.add(new BigInteger(n.toString().substring(i,i+1)));
		}
		out.println(sum);
	}
}