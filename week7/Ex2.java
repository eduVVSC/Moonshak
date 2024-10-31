import java.util.Scanner;

public class Ex2 {
	public static int calculate_num(String num)
	{
		int	sum;
		int	strlen;
		int	side = 1;
		int	sign = 0;

		sum = (int)num.charAt(0) - '0';
		strlen = num.length();
		for (int i = 1; i < strlen; i++)
		{
			if (num.charAt(i) == num.charAt(i - 1))
			{
				if(sign == 0)
				{
					sum = sum * (-1);
					sign++;
				}
				sum += (-1) * ((int)num.charAt(i) - '0');
			}
			else
				sum += (int)num.charAt(i) - '0';
		}
		return (sum);
	}

	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		String	num;


		num = input.next();
		System.out.println("points=" + calculate_num(num));
	}
}
