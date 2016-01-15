import java.io.*;
import java.awt.*;
import java.util.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class pe14
{
	public static void main(String args[])
	{
		boolean[] done = new boolean[1000000];
		done[0]=true;
		BigInteger maxx = BigInteger.ZERO;
		BigInteger maxCount = BigInteger.ZERO;
		BigInteger temp = BigInteger.ZERO;
		for(int x=done.length;x>0;x--)
		{
			if(!done[x-1])
			{
				temp = collatz(new BigInteger(""+x),done);
				if(temp.compareTo(maxCount)>0)
				{
					maxx = new BigInteger(""+x);
					maxCount = temp;
					out.println(maxx+" "+maxCount);
				}
//				out.println(x);
			}
		}
		out.println(maxx+" "+maxCount);
	}
	
	public static BigInteger collatz(BigInteger x,boolean[] done)
	{
		BigInteger count = BigInteger.ZERO;
//		out.println("****");
		while(!x.equals(BigInteger.ONE))
		{
//			out.println(x);
			if(x.intValue()>0 && x.intValue()<done.length)
				done[x.intValue()-1]=true;
			if(x.mod(new BigInteger("2")).equals(BigInteger.ZERO))
				x=x.divide(new BigInteger("2"));
			else
				x=x.multiply(new BigInteger("3")).add(BigInteger.ONE);
			count = count.add(BigInteger.ONE);
		}
//		out.println("\n"+count);
		return count;
	}
}