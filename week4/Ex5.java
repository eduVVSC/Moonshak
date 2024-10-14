import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args){
		int		digit;
		int		octal;
		double	i = 0;
		int	decimal;
		Scanner	myObj = new Scanner(System.in);

		decimal = 0;
		octal = myObj.nextInt();
		if (octal < 0)
			return ;
		else
		{
			while (octal > 0)
			{
				digit = octal % 10;
				decimal += digit * Math.pow((double)8 , i);
				octal = octal / 10;
				i++;
			}
			System.out.println(decimal);
		}
	}
}
