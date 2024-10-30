import java.util.Scanner;

// this one work with string rotation basically, so that why i was so confused
// so 123 has the option 231 or 123 or 312
//			12 ->	3 -> 12 --> 312

public class Ex6
{
	public static	int	 many_digits(int	num)
	{
		int	many_digits;

		many_digits = 0;
		while (num > 0)
		{
			num = num / 10;
			many_digits++;
		}
		return (many_digits);
	}

	public static	boolean is_prime(int	num)
	{
		for (int i = 2; i < num; i++)
		{
			if (num % i == 0)
				return false;
		}
		return (true);
	}

	public static	boolean is_full_time_prime(int	num)
	{
		int		many_nums;
		int		num_img;
		int		digit = 0;
		if (is_prime(num) == false)
			return false;
		num_img = num;
		many_nums = many_digits(num) - 1;
		do {
			digit = num_img % 10;
			num_img = num_img / 10;
			num_img = num_img + (int)(digit * Math.pow(10, many_nums));
			//System.out.println("num mixed " + num_img);
			if (is_prime(num_img) == false)
				return (false);
		} while (num_img != num);
		return true;
	}

	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		max = 0;
		int		min = 0;
		int		full_prime = 0;

		min = input.nextInt();
		max= input.nextInt();
		while (min < max)
		{
			if (is_full_time_prime(min))
			{
				System.out.println(min);
				full_prime++;
			}
			min++;
		}
		System.out.printf("(%d)\n", full_prime);
	}
}

