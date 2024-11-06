/*
Write a modular program to read a sequence of N integers and display them in the reverse order of insertion. The value of N is initially entered by the user.

Each number must be displayed in a separate lines.
*/

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int		many_nums;
		int[]	nums;

		many_nums = input.nextInt();
		if (many_nums == 0)
			return ;
		nums = new int[many_nums];
		for (int i = 0; i < many_nums; i++)
			nums[i] = input.nextInt();
		for (int i = many_nums - 1; i >= 0; i--)
			System.out.println(nums[i]);
	}
}
