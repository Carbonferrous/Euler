import java.math.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class NumberSensePractice
{
	public static void main(String args[])
	{
		Stopwatch foo = new Stopwatch();
		int num1 = 0;
		int num2 = 0;
		String result = "";
		Scanner input = new Scanner(System.in);
		out.println("Number Sense FOIL and 3 digit multiplication bashing practice\n"+
					"(C)opyright Alexandre and Thomas Ye\n" +
					"\nInstructions/Description" +
					"\n  This is a program that will randomly generate numbers" +
					"\n  for you the user to practice bashing in number sense." +
					"\n  You can designate the number of problems and how long" +
					"\n  the numbers that are being multiplied are. You can also" +
					"\n  enter the number forwards or backwards depending on how" +
					"\n  you do these problems. It will also display how long it" +
					"\n  took you for each problem and the total time spent afterwards.");
		out.println("\nEnter the number of problems you would like to do");
		int numProb = input.nextInt();
		out.println("Enter the number of digits");
		int size = input.nextInt();
		input.nextLine();
		for(int x = 0; x < numProb; x++)
		{
			num1 = (int)(random()*(pow(10,size)-pow(10,size-1)))+(int)pow(10,size-1);
			num2 = (int)(random()*(pow(10,size)-pow(10,size-1)))+(int)pow(10,size-1);
			out.println(num1 + " x " + num2);
			foo.addPoint("Problem "+(x+1));
			result = input.nextLine();
			if(Integer.parseInt(new StringBuilder(result).reverse().toString()) == (num1*num2) || Integer.parseInt(result) == (num1*num2))
				out.println();
			else
				out.println("\nYou suck! " + num1 + " x " + num2 + " = " + (num1*num2) + "\n");
			
		}
		out.println();
		out.println(foo);
	}
}