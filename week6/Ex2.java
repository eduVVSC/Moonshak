import	java.util.Scanner;

/*
Write a program to display, in the form of bar graph, the number of students in a class that scored "Approved" and "Failed" on a set of subjects.
The program should start by asking the number of students in the class and the number of subjects and, for each subject will ask the name of the subject and the number of students with approval.

Implement a module to print information about a subject.

The output should look like this:

Subject: Portuguese
- Approved: ******
- Failed: ****
Subject: Math
- Approved: *******
- Failed: ***

*/

public class Ex2 {
	public static void print(int approved, int many_students, String  subject)
	{
		int not_approved;

		not_approved = (many_students - approved);
		System.out.printf("Subject: %s\n", subject);
		System.out.printf("- Approved: ");
		for (int i = 0; i < approved; i++)
			System.out.printf("*");
		System.out.printf("\n- Failed: ");
		for (int i = 0; i < not_approved; i++)
			System.out.printf("*");
		System.out.printf("\n");
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String	subject_name;
		int		num_people;
		int		many_subject;
		int		approved;
		int		i = 0;

		num_people = input.nextInt();
		many_subject = input.nextInt();
		while (i < many_subject)
		{
			subject_name = input.next();
			approved = input.nextInt();
			print(approved, num_people, subject_name);
			i++;
		}
	}
}
