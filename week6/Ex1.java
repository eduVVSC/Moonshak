import java.util.Scanner;

public class Ex1 {

	public static int many_digits (int num) {
		String digit = Integer.toString(num);
		return (digit.length());
	}

	public static void main(String[] args)
	{
		int		MAX = 5;
		Scanner	input = new Scanner(System.in);
		int		max_digits;
		double	average;
		int		total;
		int		num;
		int		i = 1;

		max_digits = input.nextInt();
		num = input.nextInt();
		total = 0;
		while (many_digits(num) < max_digits && i <= MAX)
		{
			total = total + num;
			//System.out.printf("total -> %d\n", total);
			if (i < MAX)
				num = input.nextInt();
			i++;
		}
		average = (double)total / (i - 1);
		if ((int)average == 0)
			System.out.println("0.00");
		else
			System.out.printf("%.2f\n", average);
	}
}
