import java.util.Scanner;

/*
Build a program that reads a positive integer and display all of its dividers that are multiples of 3.
Each divider should be displayed in separated lines.
If there are no dividers, the message "without dividers multiples of 3" should be displayed.
*/

public class Ex8 {
	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		flag = 0;
		int		num;
		int		i;

		num = input.nextInt();
		i = 3;
		while (i <= num)
		{
			if (i % 3 == 0)
			{
				if (num % i == 0)
				{
					System.out.println(i);
					flag = 1;
				}
			}
			i++;
		}
		if (flag == 0)
			System.out.println("without dividers multiples of 3");
	}
}
