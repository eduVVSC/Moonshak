import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args)
	{
		Scanner	obj1 = new Scanner(System.in);
		Scanner	obj2 = new Scanner(System.in);
		int num1, num2, greater;

		num1 = obj1.nextInt();
		num2 = obj1.nextInt();
		greater = num2;
		if (num1 > num2)
			greater = num1;
		while (!((greater % num1 == 0) && (greater % num2 == 0)))
			greater++;
		System.out.println(greater);
	}
}
