import java.math.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class pe40
{
	public static void main(String args[])
	{
		String constant = "";
		for(int x = 1; x<300000; x++)
		{
			constant+=x;
		}
		out.println(constant.substring(0,1));
		out.println(constant.substring(9,10));
		out.println(constant.substring(99,100));
		out.println(constant.substring(999,1000));
		out.println(constant.substring(9999,10000));
		out.println(constant.substring(99999,100000));
		out.println(constant.substring(999999,1000000));
	}
}