import java.math.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class driver
{
	public static void main(String args[]) throws IOException
	{
		String result = "05233";
		out.println((new StringBuilder(result)).reverse());
		out.println(Integer.parseInt((new StringBuilder(result)).reverse().toString())==33250);
//		Stopwatch foo = new Stopwatch("Create Sequence");
//		ArrayList<Fraction> farey = Fraction.fareySeq(12000);
//		out.println(farey.size()-2);
//		out.println(foo);
//		out.println(NumberTheory.divisors(new BigInteger("600851475143")));
//		****************************PRIME AND STOPWATCH TESTER**********************
//		Stopwatch foo = new Stopwatch("Create Prime List");
//		ArrayList<BigInteger> primeList = NumberTheory.primeList(50000000);
//
//		out.println(foo.addPoint("Prime List Print"));
//		for(BigInteger a: primeList)
//			out.print(a+" ");
//		out.println();
//			
//		out.println(foo.addPoint("Large Prime Tester"));
//		out.println("isPrime(18446744073709551629) = "+NumberTheory.isPrime(new BigInteger("18446744073709551629")));
//		
//		out.println(foo.addPoint("Prime Oracle Test"));
//		boolean status = true;
//		for(int x=2;x<1000000;x++)
//		{
//			BigInteger term = new BigInteger(x+"");
//			out.print(NumberTheory.isPrime(term)!=term.isProbablePrime(100)?status=false:"");
//		}
//		out.println(status?"Primes under 1000000 are all correct":"Oh no, something screwd up");
//		
//		foo.addPoint("Stop");
//		out.println(foo);
//		****************************PRIME AND STOPWATCH TESTER**********************
	}
}