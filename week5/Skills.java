import java.util.Scanner;

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
