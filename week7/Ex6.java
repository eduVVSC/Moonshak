import java.util.Scanner;

/*
Write a program that reads two integers and determines which numbers in that range are full-time primes.
A number is full-time prime if it is a prime number, and any shift of one digit from end to beginning is still a prime number.

Example:
123 : 123 (is prime), 312 (not prime), 231 (is prime) : 123 NOT Full time prime
113 : 113 (is prime), 311 (is prime), 131 (is prime) : 113 Is full-time prime

The program should read two integers, representing the parsing range, and display each full-time prime number in the range on separate lines.
At the end, the number of full-time prime numbers found should be displayed, in parentheses. The result should have the following format:
< full-time prime1 >
< full-time prime2 >
...
(number of full-time primes)
*/

public class Ex6
{
	public static	int	 many_digits(int	num)
	{
		int	many_digits;

		many_digits = 0;
		while (num > 0)
		{
			num = num / 10;
			many_digits++;
		}
		return (many_digits);
	}

	public static	boolean is_prime(int	num)
	{
		for (int i = 2; i < num; i++)
		{
			if (num % i == 0)
				return false;
		}
		return (true);
	}

	public static	boolean is_full_time_prime(int	num)
	{
		int		many_nums;
		int		num_img;
		int		digit = 0;
		if (is_prime(num) == false)
			return false;
		num_img = num;
		many_nums = many_digits(num) - 1;
		do {
			digit = num_img % 10;
			num_img = num_img / 10;
			num_img = num_img + (int)(digit * Math.pow(10, many_nums));
			//System.out.println("num mixed " + num_img);
			if (is_prime(num_img) == false)
				return (false);
		} while (num_img != num);
		return true;
	}

	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		max = 0;
		int		min = 0;
		int		full_prime = 0;

		min = input.nextInt();
		max= input.nextInt();
		while (min < max)
		{
			if (is_full_time_prime(min))
			{
				System.out.println(min);
				full_prime++;
			}
			min++;
		}
		System.out.printf("(%d)\n", full_prime);
	}
}

