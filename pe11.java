import java.io.*;
import java.awt.*;
import java.util.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class pe11
{
	public static void main(String args[]) throws IOException
	{
		BigInteger[][] matrix = new BigInteger[20][20];
		Scanner input = new Scanner(new File("pe11.dat"));
		BigInteger product = BigInteger.ZERO;
		BigInteger maxProduct = new BigInteger("0");
		for(int i=0;i<20;i++)
		{
			for(int j=0;j<20;j++)
			{
				matrix[i][j] = new BigInteger(input.nextInt()+"");
				out.print(matrix[i][j]+" ");
			}
			out.println();
		}
		out.println();
		for(int i=0;i<17;i++)
		{
			for(int j=0;j<20;j++)
			{
				product = matrix[i+0][j].multiply(matrix[i+1][j]).multiply(matrix[i+2][j]).multiply(matrix[i+3][j]);
				if(product.compareTo(maxProduct)>0)
				{
//					out.println(product+" "+matrix[i][j]+" "+matrix[i+1][j]+" "+matrix[i+2][j]+" "+matrix[i+3][j]);
					maxProduct = product;
				}
				out.print(matrix[i][j]+" ");
			}
			out.println();
		}
		out.println();
		for(int i=0;i<20;i++)
		{
			for(int j=0;j<17;j++)
			{
				product = matrix[i][j+0].multiply(matrix[i][j+1]).multiply(matrix[i][j+2]).multiply(matrix[i][j+3]);
				if(product.compareTo(maxProduct)>0)
				{
//					out.println(product+" "+i+" "+j);
					maxProduct = product;
				}
				out.print(matrix[i][j]+" ");
			}
			out.println();
		}
		out.println();
		for(int i=0;i<17;i++)
		{
			for(int j=0;j<17;j++)
			{
				product = matrix[i+0][j+0].multiply(matrix[i+1][j+1]).multiply(matrix[i+2][j+2]).multiply(matrix[i+3][j+3]);
				if(product.compareTo(maxProduct)>0)
				{
//					out.println(product+" "+i+" "+j);
					maxProduct = product;
				}
				out.print(matrix[i][j]+" ");
			}
			out.println();
		}
		out.println();
		for(int i=0;i<17;i++)
		{
			for(int j=3;j<20;j++)
			{
				product = matrix[i+0][j+0].multiply(matrix[i+1][j-1]).multiply(matrix[i+2][j-2]).multiply(matrix[i+3][j-3]);
				if(product.compareTo(maxProduct)>0)
				{
//					out.println(product+" "+i+" "+j);
					maxProduct = product;
				}
				out.print(matrix[i][j]+" ");
			}
			out.println();
		}
		out.println(maxProduct);
	}
}