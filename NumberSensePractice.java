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
		out.println("Enter the number of problems you would like to do");
		int numProb = input.nextInt();
		out.println("Enter the size of the numbers to be multiplied");
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
				out.println("Good Job! " + num1 + " x " + num2 + " = " + (num1*num2));
			else
				out.println("Oh no! " + num1 + " x " + num2 + " = " + (num1*num2));
			
		}
		out.println();
		out.println(foo);
	}
}