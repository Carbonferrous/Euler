import java.io.*;
import java.awt.*;
import java.util.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class pe8
{
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(new File("pe8.dat"));
		String number = input.next();
		String[] asdf = number.split("0");
		BigInteger product = BigInteger.ONE;
		BigInteger maxProduct = BigInteger.ONE;
		for(String a:asdf)
		{
			if(a.length()>=13)
			{
				for(int x = 0;x<a.length()-12;x++)
				{
					product = BigInteger.ONE;
					for(int j = 0;j<13;j++)
					{
						product = product.multiply(new BigInteger(a.substring(x,x+13).substring(j,j+1)));
					}
					maxProduct = product.max(maxProduct);
				}
			}
		}
		out.println(maxProduct);
	}
}