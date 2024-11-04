import java.util.Scanner;

/*
Check if an integer, read from the keyboard, has repeated digits. Checking must be done from right to left.
If a repetition is detected, immediately display the repeated digit and the respective positions in which they occur (from right to left), in the following format:

<number> : digit (<d>) repeated in positions (<p1>) and (<p2>)

where <number> is the number read from the keyboard, <a> is the repeated digit and <p1> and <p2> the positions where they occur.

For example, the number 890230 has the digit (0) repeated in positions (1) and (4).

The algorithm must be applied to a sequence of integers terminated by a negative number.
*/

public class Ex6 {
	public static void main(String[] args)
	{
		int	NOT_FOUND = 0;
		int	FOUND = 1;
		Scanner	input = new Scanner(System.in);
		int		pos_1 = 0, pos_2 = 0;
		int		i, len;
		int		flag;
		char	digit;
		String	num;

		num = input.nextLine();
		digit = 'a';
		while (Integer.parseInt(num) > 0)
		{
			len = num.length() - 1;
			flag = NOT_FOUND;
			while (len >= 0 && flag == NOT_FOUND)
			{
				digit = num.charAt(len);
				pos_1 =  (len -  num.length()) * (-1);
				i = len - 1;
				//System.out.printf("%d - %d\n", i , len);
				while (i >= 0 && flag == NOT_FOUND)
				{
					//System.out.println(num.charAt(i));
					if (digit == num.charAt(i))
					{
						pos_2 = (i -  num.length()) * (-1);
						flag = FOUND;
					}
					i--;
				}
				len--;
			}
			if (flag == FOUND)
				System.out.printf("%s : digit (%c) repeated in positions (%d) and (%d)\n", num, digit, pos_1, pos_2);
			num = input.next();
		}
	}
}
