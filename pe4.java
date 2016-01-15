import java.math.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class pe4
{
	public static void main(String args[]) throws IOException
	{
		for(int i = 9;i>0;i--)
			for(int j=9;j>-1;j--)
				for(int k=9;k>-1;k--)
				{
					BigInteger pal = new BigInteger(""+i+j+k+k+j+i);
					ArrayList<BigInteger> divisors = NumberTheory.divisors(pal);
					int size = divisors.size();
					for(int x = size-1;x>=(size+1)/2;x--)
						divisors.remove(x);
					for(int x = 0;x<divisors.size();x++)
					{
						boolean satisfied = divisors.get(x).toString().length()==3 && pal.divide(divisors.get(x)).toString().length()==3;
						if(satisfied)
						{
							out.println(pal);
							System.exit(0);
						}
					}
				}
	}
}