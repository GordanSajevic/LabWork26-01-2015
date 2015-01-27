import java.util.Date;


public class TimeCount {

	private static boolean isPrime(int num)
	{
		for (int i=2; i<num; i++)
		{
			if (num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	private static int countPrimes(int a, int b)
	{
		int primes = 0;
		for (int i=a; i<b; i++)
		{
			if (isPrime(i))
			{
				primes++;
			}
		}
		return primes;
	}
	
	public static void main(String[] args) 
	{
		Date startDate = new Date();
		int primes = countPrimes(1, 200000);
		Date endDate = new Date();
		System.out.println(primes);
		System.out.println("Seconds: " + (double)(endDate.getTime() - startDate.getTime())/1000);
		

	}

}
