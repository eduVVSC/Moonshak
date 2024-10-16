import java.util.Scanner;

public class Ex4 {
	public static int growing(int num)
	{
		int	digit;
		int	digit_now;
		int	num_img;
		int	flag = 0;

		while (num > 0 && flag == 0)
		{
			num_img = num /10;
			digit = num % 10;
			while (num_img > 0 && flag == 0)
			{
				digit_now = num_img % 10;
				if (digit < digit_now)
					flag = 1;
				num_img = num_img / 10;
			}
			num = num /10;
		}
		return flag;
	}

	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		num_now;
		int		last_num;
		int		i;

		i = 0;
		num_now = input.nextInt();
		while (num_now >= 0)
		{
			last_num = num_now;
			num_now = input.nextInt();
			if (num_now > last_num && growing(num_now) == 0)
				System.out.println(num_now);
		}
	}
}
