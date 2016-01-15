import java.math.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import static java.lang.Math.*;
import static java.lang.System.*;

class pe18
{
	public static void main(String args[]) throws IOException
	{
		int size = 100;
		Scanner input = new Scanner(new File("pe67.dat"));
		int[][] triangle = new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<=i;j++)
			{
				triangle[i][j] = input.nextInt();
//				out.print(triangle[i][j]+" ");
			}
//			out.println();
		}
		for(int i=size-2;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				triangle[i][j] = triangle[i+1][j]>triangle[i+1][j+1]?(triangle[i][j]+triangle[i+1][j]):(triangle[i][j]+triangle[i+1][j+1]);
//				out.print(triangle[i][j]+" ");
			}
//			out.println();
		}
		out.println(triangle[0][0]);
	}
}
