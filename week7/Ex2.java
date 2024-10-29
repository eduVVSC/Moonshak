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
		System.out.println("num " + ((int)num.charAt(0) - '0') + "sum " + sum);
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
			System.out.println("num " + ((int)num.charAt(i) - '0') + "sum " + sum);
			//if (side == 2)
			//	side = 0;
			//side++;
		}
		return (sum);
	}

	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		String	num;


		num = input.next();
		System.out.println(calculate_num(num));
	}
}
