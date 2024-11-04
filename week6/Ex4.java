import	java.util.Scanner;

/*
Write a program that calculates the number of possible combinations and
permutations of a set of elements. You must enter the total quantity of elements (m) and the subset size to group (n).
*/

public class Ex4 {
	public static int factorial(int num)
	{
		if (num == 0)
			return (1);
		if (num == 1)
			return (1);
		return (num * factorial(num - 1));
	}

	public static int combination(int fact_num1, int fact_num2, int fact_less)
	{
		return (fact_num1 / (fact_less * fact_num2));
	}

	public static int permutation (int fact_num1, int fact_less)
	{
		return (fact_num1 / fact_less);
	}

	public static void main(String[] argv)
	{
		Scanner input = new Scanner(System.in);
		int		num1;
		int		num2;
		int		fact_num1;
		int		fact_num2;
		int		fact_less;


		num1 = input.nextInt();
		num2 = input.nextInt();
		if (num1 < num2)
			return ;
		fact_num1 = factorial(num1);
		fact_num2 = factorial(num2);
		fact_less = factorial((num1 - num2));
		System.out.printf("C(%d,%d)=%d\n", num1, num2, combination(fact_num1, fact_num2, fact_less));
		System.out.printf("P(%d,%d)=%d\n",  num1, num2, permutation(fact_num1, fact_less));
	}
}
