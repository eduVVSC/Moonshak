/*
Write a program to read the name and salary of a company's employees and display the top three (3) highest paid employees.

The program should start by reading, continuously, the name and salary of each employee. Reading ends when the name "END" is entered as the name of an employee.

Then, the top three (3) highest paid employees must be calculated and displayed. If there are employees with the equal salary, the choice should follow the ascending alphabetical order of the name.

Each employee of the top three (if any) should be displayed on separate lines. The name and salary of each employee must be displayed in descending order of salary, in the following format:

"#<top order>:<name>:<salary>
*/

import java.util.Scanner;

public class Ex1
{
	public static final int ALOCATION = 24748345;

	public	static int reading_values(String[] employee, int[] salary, Scanner input)
	{
		int	j;

		for (j = 0; j < ALOCATION; j++)
		{
			employee[j] = input.nextLine();
			if (employee[j].equals("END"))
				return j;
			salary[j] = Integer.parseInt(input.nextLine());
		}
		return j;
	}

	public static void	print_all(int[] salary, String[] employee, int max)
	{
		for (int i = 0; i < max; i++)
			System.out.printf("#%d %s:%d\n", (i + 1), employee[i], salary[i]);
	}

	public static void	highest_paying(int[] salary, String[] employee,int many_employee)
	{
		String[]	highest_names;
		int[]		highest_salary;
		int			highest_now;
		int			max;

		max = 3;
		highest_names = new String[3];
		highest_salary = new int[3];
		if (many_employee < 3)
			max = many_employee;
		for (int j = 0; j < max; j++)
		{
			highest_now = 0;
			highest_salary[j] = 0;
			for (int i = 0; i < many_employee; i++)
			{
				//System.out.println(salary[i]);
				if (salary[i] > highest_salary[j])
				{
					highest_names[j] = employee[i];
					highest_salary[j] = salary[i];
					highest_now = i;
				}
				else if (highest_salary[j] == salary[i] && highest_salary[j] != 0)
				{
					if ((int) highest_names[j].charAt(0) > (int) employee[i].charAt(0))
					{
						highest_names[j] = employee[i];
						highest_salary[j] = salary[i];
						highest_now = i;
					}
				}
			}
			salary[highest_now] = 0;
		}
		print_all(highest_salary, highest_names, max);
	}

	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		String[] empolyee;
		int[] salary;
		int		many_employee;

		empolyee = new String[ALOCATION];
		salary = new int[ALOCATION];
		many_employee = reading_values(empolyee, salary, input);
		highest_paying(salary, empolyee, many_employee);
	}

}
