import java.io.*;
import java.awt.*;
import java.util.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class pe1
{
	public static void main(String args[])
	{
		int count = 0;
		int sum = 0;
		for(int i=0;i<1000;i++)
		{
			if(i%3==0 || i%5==0)
				sum+=i;
		}
		out.println(sum);
	}
}