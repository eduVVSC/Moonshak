import java.util.Scanner;

/*
Build a program that based on an integer value, representative of a clock Code, indicates the clock Brand.

The following table indicates the correspondence between the clock Code and the clock Brand.
*/

public class Ex7 {
	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		num;

		num = input.nextInt();
		switch (num)
		{
			case 1:
				System.out.println("Tag Heuer");
				break;
			case 2:
				System.out.println("Rolex");
				break;
			case 3:
				System.out.println("Omega");
				break;
			case 4:
				System.out.println("Cartier");
				break;
			case 5:
				System.out.println("Bvlgari");
				break;
			case 6:
				System.out.println("Raymond Weil");
				break;
			default:
				System.out.println("Invalid brand");
				break;
		}
	}
}
