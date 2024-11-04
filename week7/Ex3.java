import	java.util.Scanner;

/*
Write a program to read a sentence and to write how many words the sentence has.
A word is considered to be any set of symbols that are between spaces.

Implement a module that receives the sentence and returns the amount of words in that phrase.
*/

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
