import java.util.Scanner;

/*
Build a program that calculates the product of odd digits
of a positive integer entered by the user.For example,
if the input is number 56983 the output will be
 135 (3 * 9 * 5).

If there are no odd digits, it should be displayed
 the message "no odd digits".

The algorithm must be applied to a sequence
of integers ending with a non-positive number.
*/
public class Ex4 {
	public static void main(String[] args)
	{
		int	mult;
		int	num;
		int flag;
		int	digit;
		Scanner myObj = new Scanner(System.in);

		num = myObj.nextInt();
		while (num >= 0)
		{
			flag = 0;
			mult = 1;
			while(num > 0)
			{
				digit = num % 10;
				num = num / 10;
				if (digit % 2 == 1)
				{
					mult *= digit;
					flag = 1;
				}
			}
			if(mult == 1 && flag == 0)
				System.out.println("no odd digits");
			else
				System.out.println(mult);
			num = myObj.nextInt();
		}
		return ;
	}
}
