import java.util.Scanner;

public class D {
	public static void main(String[] args)
	{
		int	sum;
		int	num;
		int flag;
		int	digit;
		Scanner myObj = new Scanner(System.in);

		sum = 1;
		flag = 0;
		num = myObj.nextInt();
		if (num >= 0)
		{
			while(num > 0)
			{
				digit = num % 10;
				num = num / 10;
				if (digit % 2 == 1)
				{
					sum *= digit;
					flag = 1;
				}
			}
			if(sum == 1 && flag == 0)
				System.out.println("no odd digits");
			else
				System.out.println(sum);
		}
		return ;
	}
}
