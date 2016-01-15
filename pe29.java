import java.io.*;
import java.awt.*;
import java.util.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class pe29
{
	public static void main(String args[])
	{
		ArrayList<BigInteger> list = new ArrayList<BigInteger>();
		int count = 0;
		for(int a=2;a<101;a++)
			for(int b=2;b<101;b++)
				list.add((new BigInteger(a+"")).pow(b));
		Collections.sort(list);
		for(int x=1;x<list.size();x++)
			if(!list.get(x).equals(list.get(x-1)))
				count++;
		out.println(count);
	}
}