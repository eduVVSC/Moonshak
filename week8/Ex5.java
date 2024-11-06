/*
Write a program to determine some statistics on employee salaries of a company. The number of employees may vary over time, will be at least one, but will never exceed 20.
The program must read to each employee their name and salary. Reading ends when the name "end" is entered.

The program must display in separate lines the average salary(with 1 decimal place)as well as the name of each employee earning less than the average salary.
*/

import java.util.Scanner;

public class Ex5{
	public static final int MAX = 20;

	public static double average_salary(double[] salary, int many_salaries)
	{
		double	average = 0;

		for (int i =+ 0; i < many_salaries; i++)
			average += salary[i];
		average = average / many_salaries;
		return (average);
	}

	public static void under_average(double[] salary, String[] name, int many_employees, double average)
	{
		for (int i = 0; i < many_employees; i++)
		{
			if(salary[i] < average)
				System.out.println(name[i]);
		}
	}


	public static void main(String[] args)
	{
		Scanner		input = new Scanner(System.in);
		double		average;
		double[]	salary;
		String[]	name;
		int			i = 0;

		name = new String[MAX];
		salary = new double[MAX];
		name[i] = input.next();
		while ((!name[i].equals("end") )&& i < MAX)
		{
			salary[i] = input.nextDouble();
			i++;
			name[i] = input.next();
		}
		System.out.println(average = average_salary(salary, i));
		under_average(salary, name, i, average);
	}

}
