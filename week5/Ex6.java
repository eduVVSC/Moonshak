import java.util.Scanner;

// need to fix there is somthing wrong with the counter pos1;
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
