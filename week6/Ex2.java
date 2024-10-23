import	java.util.Scanner;

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
