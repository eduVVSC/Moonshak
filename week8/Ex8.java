/*
Write a modular program to read a sequence of N integers.
The value of N is initially entered by the user.
Then the program should read the N integers.
Finally, the program must accept 3 possible commands: "right", "left" and "exit" whose meaning is:
"right" - rotate the sequence 1 position to the right (eg 1 2 3 4 → 4 1 2 3)
"left" - rotate the sequence 1 position to the left (eg 1 2 3 4 → 2 3 4 1)
"exit" - end the program

The program must accept "right" or "left" commands until the "exit" command that terminates the program.
Each time the "right" or "left" command is executed, the result of the sequence should be displayed.
Each sequence should be displayed on a single line and each element should be displayed in square brackets in the following format:

"[a][b]...[n]"
*/

import java.util.Scanner;

public class Ex8 {
	public static void	print_num(int[]nums, int many_nums)
	{
		for (int i = 0; i < many_nums; i++)
			System.out.printf("[%d]", nums[i]);
		System.out.println("");
	}

	public static int[]	move_right(int[] nums, int many_nums)
	{
		int[] new_nums;

		new_nums = new int[many_nums];
		new_nums[0] = nums[many_nums - 1];
		for (int i = 1; i < many_nums; i++)
			new_nums[i] = nums[i - 1];
		print_num(new_nums, many_nums);
		return (new_nums);
	}

	public static int[]	move_left(int[] nums, int many_nums)
	{
		int[] new_nums;

		new_nums = new int[many_nums];
		for (int i = 0; i < many_nums - 1; i++)
			new_nums[i] = nums[i + 1];
		new_nums[many_nums - 1] = nums[0];
		print_num(new_nums, many_nums);
		return (new_nums);
	}

	public static void	playing(Scanner input, int[] nums, int many_nums)
	{
		String	action;

		action = input.next();
		while (!action.equals("exit"))
		{
			switch (action) {
				case "left":
					nums = move_left(nums, many_nums);
					break;
				case "right":
					nums = move_right(nums, many_nums);
					break;
				default:
					break;
			}
			action = input.next();
		}
	}

	public static void	main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		many_nums;
		int[]	nums;

		many_nums = input.nextInt();
		nums = new int[many_nums];
		for (int i = 0; i < many_nums; i++)
			nums[i] = input.nextInt();
		playing(input, nums, many_nums);
	}
}
