import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args){
		Scanner	myObj = new Scanner(System.in);
		int		decimal;
		int		digit;
		int		octal;
		double	i;

		octal = myObj.nextInt();
		while (octal >= 0)
		{
			decimal = 0;
			i = 0;
			while (octal > 0)
			{
				digit = octal % 10;
				decimal += digit * Math.pow((double)8 , i);
				octal = octal / 10;
				i++;
			}
			System.out.println(decimal);
			octal = myObj.nextInt();
		}
	}
}
