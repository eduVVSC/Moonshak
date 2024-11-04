import java.util.Scanner;

/*
Build a program that determines and displays prime numbers up to a certain N value entered by the user.
A number is prime if it is integer, greater than 1, and only divisible, by itself and by 1.

Each number must appear on a separate line.
*/

public class Ex1 {
	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		divisors;
		int		num_max;
		int		num = 2;
		int		j;

		num_max = input.nextInt();
		System.out.println("2");
		while (++num < num_max)
		{
			divisors = 2;
			j = 2;
			while (j < num/2 && divisors == 2)
			{
				if (num % j == 0)
					divisors++;
				j++;
			}
			if (divisors == 2)
				System.out.println(num);
		}
	}
}
