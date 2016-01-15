import java.io.*;
import java.awt.*;
import java.util.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class pe13
{
	public static void main(String args[]) throws IOException
	{
		BigInteger[] num = new BigInteger[100];
		BigInteger sum = new BigInteger("0");
		Scanner inFile = new Scanner(new File("pe13.dat"));
		for(int x=0;x<100;x++)
		{
			num[x] = new BigInteger(inFile.nextLine());
		}
		for(BigInteger a: num)
			sum=sum.add(a);
		out.println(sum.toString().substring(0,10));
	}
}