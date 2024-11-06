/*
Write a program to simulate a financial investment after 6 months.
The investment consists of an initial bank deposit with capitalizable bank rate for each month, ie, at the end of each month the deposit amount will be increased by the respective bank rate of that month.

First, the program must read the bank rates for each of the six months. Second, it must read the amount of the initial deposit. Finally, it must display the amount of the deposit after 6 months, using two decimal places in the following format:

"final value=<value>"
*/

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int			money_return;
		int			invested;
		double[]	rate;

		rate = new double[6];
		for (int i = 0; i < 6; i++)
			rate[i] = input.nextDouble();
		invested = input.nextInt();
	}
}
