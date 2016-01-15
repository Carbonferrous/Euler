import java.io.*;
import java.awt.*;
import java.util.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class pe22
{
	public static void main(String args[]) throws IOException
	{
		Scanner inFile = new Scanner(new File("pe22.dat"));
		
		ArrayList <String> names = new ArrayList <String> ();
		String[] namesArray = inFile.nextLine().split(",");
		for(String s: namesArray)
			names.add(s);
		Collections.sort(names);
		BigInteger sum = new BigInteger("0");
		int temp = 0;
		for(int x=0;x<names.size();x++)
		{
			for(int y=0;y<names.get(x).length();y++)
			{
				temp+= (int)names.get(x).charAt(y) - 64;
			}
			sum = sum.add(new BigInteger(temp*(x+1)+""));
			temp = 0;
		}
		out.println(sum);
//		for(String a: names)
//			out.print(a+", ");
	}
}