import java.util.Scanner;

/*
 Build a program that given a positive integer checks whether or not it is a prime number.
A number is prime if it is an integer greater than 1 and is only divisible, by itself and by 1.

The result should be the message "prime" or "not prime".
*/

public class Ex8 {
	public static void main(String[] args)
	{
		int		num;
		int		num_of_divisors;
		int		num_now;
		Scanner	myObj = new Scanner(System.in);

		num_now = 2;
		num_of_divisors = 2;
		num =myObj.nextInt();
		while (num_now <= (num / 2))
		{
			if (num % num_now == 0)
				num_of_divisors++;
			num_now++;
		}
		if (num_of_divisors == 2 && num > 1)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}
}
