/*
Write a program to read the grades that N students obtained on a test, and calculate the absolute frequencies for the grades obtained.
It is intended to know for each grade, from zero (0), one (1), ..., up to twenty (20), how many students obtained this grade.
Grades are integer values ​​and can range from zero (0) to twenty (20) inclusive.
The program should start by reading the value of N, followed by reading the grade of each student.

The program must display the scale from zero (0) to twenty (20) and, for each value of the scale, the number of students who obtained this grade, separated by a space. Each scale grade (from zero to twenty) and its frequency should appear on separate lines in the following format:

0 <n. students with grade 0>
1 <n. students with grade 1>
...
20 <n. students with grade 20>

Implement the following functionality using modularization:
a) Read and store student grades.
b) Determine the frequencies of grades from zero to twenty.
c) Display frequency values
*/

import java.util.Scanner;

public class Ex4 {
	public static int nums_found(int num, int[] grades, int many_grades)
	{
		int		found = 0;

		for (int i = 0; i < many_grades; i++)
		{
			if (grades[i] == num)
				found++;
		}
		return (found);
	}

	public static void grade_counter(int[] grades, int many_grades)
	{
		int[]		count_grades;

		count_grades = new int[21];
		for (int i = 0; i < 21; i++)
			count_grades[i] = nums_found(i, grades, many_grades);
		for (int j = 0; j < 21; j++)
			System.out.printf("%d %d\n", j, count_grades[j]);
	}

	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		many_grades;
		int[]	grades;

		many_grades = input.nextInt();
		grades = new int[many_grades];
		for (int i = 0; i < many_grades; i++)
			grades[i] = input.nextInt();
		grade_counter(grades, many_grades);
	}
}
