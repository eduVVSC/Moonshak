import java.util.Scanner;

public class Ex8
{
	public static final int MAX = 5;

	public static int is_palindrome(String	num)
	{
		int min,max;

		max = num.length() - 1;
		min = 0;
		while (min < max)
		{
			if (num.charAt(min) != num.charAt(max))
			{
				return (1);
			}
			min++;
			max--;
		}
		return (0);
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int		flag = 1;
		String	num;

		for (int i = 0; i < MAX; i++)
		{
			num = input.next();
			if (is_palindrome(num) == 0)
			{
				System.out.println("palindrome");
				flag = 0;
				break ;
			}
		}
		if (flag == 1)
			System.out.println("attempts exceeded");
	}
}
