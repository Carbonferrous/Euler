import java.io.*;
import java.awt.*;
import java.util.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class pe42
{
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(new File("pe42.dat"));
		String[] words = input.next().split(",");
		BigInteger count = BigInteger.ZERO;
		ArrayList<BigInteger> tri = new ArrayList<BigInteger>();
		for(int x=0;x<500;x++)
			tri.add(new BigInteger(x*(x+1)/2+""));
		for(String s: words)
		{
			BigInteger wordValue = BigInteger.ZERO;
			for(int i=0;i<s.length();i++)
			{
				wordValue = wordValue.add(new BigInteger(s.charAt(i)-64+""));
			}
			if(tri.contains(wordValue))
				count = count.add(BigInteger.ONE);
		}
		out.println(count);
	}
}
