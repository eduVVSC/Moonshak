import java.util.Scanner;

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
