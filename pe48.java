import java.io.*;
import java.awt.*;
import java.util.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class pe48
{
	public static void main(String args[])
	{
		BigInteger sum = BigInteger.ZERO;
		for(int x=1;x<1001;x++)
		{
			sum = sum.add((new BigInteger(x+"")).modPow(new BigInteger(x+""), new BigInteger("10000000000"))).mod(new BigInteger("10000000000"));
		}
		out.println(sum);
	}
}
