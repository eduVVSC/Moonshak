import java.util.Scanner;

/*
The company SoftSkills wants to know what skills it has available among all its employees.
Each skill is represented by a digit. The digit zero (0) does not represent any skill.
An employee's skills are expressed as a whole number whose digits represent the respective skills.

The aim is to read the numbers with the skills of the company's employees and determine the number that combines all the different skills available.
The reading ends with the number zero.

In the company, skills are analyzed from left to right of the numbers.
The resulting number must have the digits in the sequence in which they appear, from left to right.

input:
A set of integers, one on each line, representing each employee's skills. The last number is zero.

output:
The whole number with the distinct competencies found, among all employees

note: You should solve the problem using only integer type variables.
*/

public class Skills {
	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		String	num_img;
		String	skills;
		int		img_len;
		int		digit;
		int		is_new;
		int		num;

		num = input.nextInt();
		skills = "";
		while (num != 0)
		{
			num_img = Integer.toString(num);
			img_len = num_img.length();
			// skills -> num_new
			for (int j = 0; j < img_len; j++)
			{
				is_new = 0;
				for (int i = 0; i < skills.length(); i++)
				{
					if(skills.charAt(i) == num_img.charAt(j))
					{
						is_new = 1;
						break ;
					}
				}
				if (is_new == 0)
					skills = skills + num_img.charAt(j);
			}
			num = input.nextInt();
		}
		if (skills != "")
			System.out.println(skills);
	}
}

//		Skill				input
///		0
//		123					135
//		1235
