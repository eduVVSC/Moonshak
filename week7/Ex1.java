import java.util.Scanner;

/*
Write a program that reads a positive integer N (N<=100) and displays all of its distinct decompositions as the sum of three positive integers.
Triples that have the same values, but in different order, should be ignored. At the end, you should also display the number of distinct triples.
Larger values should appear on the left.
Display the information in the following format:

<n1> + <n2> + <n3>
<n4> + <n5> + <n6>
...
triples=<distinct triples>

Implement a method that calculates, displays the triples and returns the number of distinct triples.
*/

public class Ex1
{
	public static final int MAX = 100;

	public static void triple_sum_nums(int num)
	{
		int		n1, n2, n3;
		int		many_trip;

		n1 = num - 1;
		many_trip = 0;
		while (n1 > 0)
		{
			n2 = n1;
			n3 = n1;
			while (n2 > 0)
			{
				n3 = n2;
				while (n3 > 0)
				{
					if ((n1 + n2 + n3) == num)
					{
						many_trip++;
						System.out.printf("%d + %d + %d\n", n1, n2, n3);
					}
					n3--;
				}
				n2--;
			}
			n1--;
		}
		System.out.printf("triples=%d\n", many_trip);
	}

	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		num;

		num = input.nextInt();
		if (num > MAX || num < 0)
			return ;
		triple_sum_nums(num);
	}
}
