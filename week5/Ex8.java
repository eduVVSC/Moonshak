import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		num;
		int		i;

		num = input.nextInt();
		i = 3;
		while (i <= num)
		{
			if (i % 3 == 0)
			{
				if (num % i == 0)
					System.out.println(i);
			}
			i++;
		}
	}
}
