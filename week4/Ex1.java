import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		int	sum;
		int	num;
		int	digit;
		Scanner myObj = new Scanner(System.in);

		sum = 0;
		num = myObj.nextInt();
		while(num > 0)
		{
			digit = num % 10;
			num = num / 10;
			if (digit % 2 == 0)
				sum += digit;
		}
		System.out.println(sum);
		//return (sum);
	}
}
