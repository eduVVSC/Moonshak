/*
Write a program to read the APROG exam scores for a class with N students (for an array). The number of students (N) is entered by the user.
Then calculate and show the class average.
Finally, display how many students failed the course (grade <10).

The program should display the class average (formatted to 1 decimal place) and how many students failed the course on separate lines with the following format:

average=<average>
failures=<number of failures>
*/

import java.util.Scanner;

public class Ex1{
	public static double average(int many_nums, int[] grades)
	{
		double	average;
		double		sum = 0;

		average = 0;
		for (int i = 0; i < many_nums; i++)
			sum += grades[i];
		average = sum / many_nums;
		return (average);
	}
	public static int failures(int many_nums, int[] grades)
	{
		int	failure = 0;

		for (int i = 0; i < many_nums; i++)
			if(grades[i] < 10)
				failure++;
		return (failure);
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[]	grades;
		int		many_nums;

		many_nums = input.nextInt();
		grades = new int[many_nums];
		for (int i = 0; i < many_nums; i++)
			grades[i] = input.nextInt();
		System.out.printf("average=%.1f\n",  average(many_nums, grades));
		System.out.printf("failures=%d\n", failures(many_nums, grades));
	}
}
