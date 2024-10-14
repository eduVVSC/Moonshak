import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args)
	{
		String num;
		int min,max;
		Scanner	myObj = new Scanner(System.in);

		num =myObj.nextLine();
		max = num.length() - 1;
		min = 0;
		while (min < max)
		{
			if (num.charAt(min) != num.charAt(max))
			{
				System.out.println("not palindrome");
				return ;
			}
			min++;
			max--;
		}
		System.out.println("palindrome");
	}
}
