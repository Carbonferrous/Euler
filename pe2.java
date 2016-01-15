import java.io.*;
import java.awt.*;
import java.util.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class pe2
{
	public static void main(String args[])
	{
		int f = 2;
		int x = 1;
		int y = 1;
		int sum = 0;
		while(f<4000000)
		{
			if(f%2==0)
				sum+=f;
			y = x;
			x = f;
			f = x+y;
		}
		out.println(sum);
	}
}