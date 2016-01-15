import java.math.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import static java.lang.Math.*;
import static java.lang.System.*;

class NumberTheory
{
	public NumberTheory()
	{
		
	}
	
	//****************************************PRIMES****************************************
	public static ArrayList<BigInteger> primeList(int n)
	{
		ArrayList<BigInteger> primes = new ArrayList<BigInteger>();
		boolean[] isPrime = new boolean[n+1];
		int maxTest = (int)Math.sqrt(n)+1;
		for(int x=0;x<n+1;x++)
			isPrime[x]=true;
		isPrime[0]=false;
		isPrime[1]=false;
		for(int x=2;x<maxTest;x++)
			if(isPrime[x])
				for(int j=2*x;j<n+1;j+=x)
					isPrime[j]=false;
		for(int i=0;i<n+1;i++)
			if(isPrime[i])
				primes.add(new BigInteger(i+""));
		return primes;
	}
	public static int primeCount(int n)
	{
		return primeList(n).size();
	}
	public static boolean isPrime(BigInteger n)
	{
		if(n.signum()<=0)
			return false;
		if(n.equals(BigInteger.ONE))
			return false;
		if(n.equals(new BigInteger("2"))||n.equals(new BigInteger("3")))
			return true;
		if(n.remainder(new BigInteger("2")).equals(BigInteger.ZERO) || n.remainder(new BigInteger("3")).equals(BigInteger.ZERO))
			return false;
//		ArrayList<BigInteger> asdf = primeList((int)Math.sqrt(n.doubleValue())+1);
//		for(BigInteger a: asdf)
//			if(n.remainder(a).equals(BigInteger.ZERO))
//				return false;
//		return true;
		final BigInteger SIX = new BigInteger("6");
		BigInteger divisor = SIX.add(BigInteger.ONE.negate());
		while(divisor.multiply(divisor).compareTo(n)<=0)
		{
			if(n.remainder(divisor).equals(BigInteger.ZERO))
				return false;
			if(n.remainder(divisor.add(BigInteger.ONE.add(BigInteger.ONE))).equals(BigInteger.ZERO))
				return false;
			divisor = divisor.add(SIX);
		}
		return true;
	}
	//****************************************FACTORS****************************************
	public static boolean divides(BigInteger a, BigInteger b)
	{
		return a.remainder(b).equals(BigInteger.ZERO);
	}
//	public static ArrayList<ArrayList<BigInteger>> primeFactorization(BigInteger n)
	public static ArrayList<BigInteger> divisors(BigInteger n)
	{
		BigInteger divisor = BigInteger.ONE;
		ArrayList<BigInteger> output = new ArrayList<BigInteger>();
		if(n.signum()<=0)
			return output;
		while(divisor.multiply(divisor).compareTo(n)<=0)
		{
			if(n.remainder(divisor).equals(BigInteger.ZERO))
			{
				output.add(divisor);
				output.add(n.divide(divisor));
			}
			divisor = divisor.add(BigInteger.ONE);
		}
		divisor = divisor.add(BigInteger.ONE.negate());
		if(divisor.multiply(divisor).equals(n))
			output.remove(output.size()-1);
		Collections.sort(output);
		return output;
	}
//	public static ArrayList<BigInteger> primeDivisors(BigInteger n)
//	public static BigInteger phi(BigInteger n) //Euler's totient function
	public static BigInteger divisorSum(BigInteger n)
	{
		BigInteger sum = BigInteger.ZERO;
		ArrayList<BigInteger> divis = divisors(n);
		for(BigInteger a: divis)
			sum = sum.add(a);
		return sum;
	}
	public static BigInteger numDivisors(BigInteger n)
	{
		return new BigInteger(divisors(n).size()+"");
	}
	public static BigInteger lcm(BigInteger a, BigInteger b)
	{
				return a.multiply(b).divide(a.gcd(b));
	}
	
	//****************************************SETS****************************************
//	public static BigInteger fibonacci(BigInteger n)
//	public static BigInteger lucas(BigInteger n)
//	public static BigInteger polygonal(BigInteger n)
//	public static BigInteger figurate(BigInteger n)
//	public static ArrayList<BigInteger> setList(String list, BigInteger n)
	
	//****************************************STUFF****************************************
//	public static BigInteger factorial(BigInteger n)
//	public static BigInteger digitPower(BigInteger  n, int p)
//	public static String baseToBase(String a, int b1, int b2)
//	public static boolean isPalindrome(BigInteger n)
}