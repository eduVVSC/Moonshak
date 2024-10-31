import	java.util.Scanner;

// concertar depois
public abstract class Ex3
{
	public static int	count_words(String str)
	{
		int	many_words;
		int	strlen;

		many_words = 0;
		strlen = str.length();
		if (str.charAt(0) != ' ')
			many_words++;
		for (int i = 1; i < strlen; i++)
		{
			if (str.charAt(i) != ' ' && str.charAt(i - 1) == ' ')
				many_words++;
		}
		return (many_words);
	}

	public static void	main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		String	str;

		str = input.nextLine();
		if (str.isEmpty())
			System.out.println(0);
		else
			System.out.println(count_words(str));
	}
}
