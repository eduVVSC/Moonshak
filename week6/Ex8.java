import java.util.Scanner;

/*
A palindrome is a sequence that reads the same backward as forward.
a) Implement a method that checks whether or not an integer is a palindrome.

b) Write a program to find a palindrome in a sequence of user-entered integers. The program should read a number, verify if it is a palindrome and, if so, the message "palindrome" should be displayed, otherwise another number should be read. The program ends when it finds a palindrome or the size of the sequence exceeds a threshold value (5). The threshold value is the maximum number of attempts (5) without finding a palindrome. The message "attempts exceeded" should be displayed if the threshold value is exceeded.
*/

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
