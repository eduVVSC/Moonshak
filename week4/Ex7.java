import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args)
	{
		int		num;
		int		num_of_divisors;
		int		num_now;
		Scanner	myObj = new Scanner(System.in);

		num_now = 1;
		num_of_divisors = 0;
		num =myObj.nextInt();
		while(num_now <= num)
		{
			if (num % num_now == 0)
			{
				num_of_divisors++;
				System.out.println(num_now);
			}
				num_now++;
		}
		System.out.printf("(%d)\n", num_of_divisors);
	}
}
