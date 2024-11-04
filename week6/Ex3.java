import	java.util.Scanner;

/*
a) Implement a method that calculates an inner angle of a triangle. The method must take as parameter the measurements on the three sides of the triangle and returns the calculated angle in degrees.

b) Write a program that asks for the three-sided measurements of a triangle, check if they are valid and if it is possible to form a triangle. If so, calculate all 3 internal angles of this triangle. To do this, invoke the method developed in the previous paragraph three times.

Results should be displayed in separate lines and angle values ​​in degrees with two decimal places.
If it is not possible to form a triangle, the message "impossible" should be displayed.

a=2.00
b=3.00
c=4.00
ang (a,b)=104.48
ang (a,c)=46.57
ang (b,c)=28.96
*/

public class Ex3
{
	public static int		possible(double side1, double side2, double side3)
	{
		double	sum;
		double	greater;
		if ((side1 + side2 <= side3) || (side3 + side2 <= side1) || (side1 + side3 <= side1))
			return (1);
		if(side1 == 0 || side2 == 0 || side3 == 0)
			return (1);
		return (0);
	}

	public static double	angle(double side1, double side2, double side3)
	{
		double	angle;
		angle = Math.acos(((Math.pow(side1, 2) + Math.pow(side2, 2)) - Math.pow(side3, 2) ) / (2 * side1 * side2));
		return (Math.toDegrees(angle));
	}

	public static void		main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double		side_a;
		double		side_b;
		double		side_c;

		side_a = input.nextDouble();
		side_b = input.nextDouble();
		side_c = input.nextDouble();
		if (possible(side_a, side_b, side_c) == 1)
		{
			System.out.println("impossible");
			return ;
		}
		System.out.printf("a=%.2f\n", side_a);
		System.out.printf("b=%.2f\n", side_b);
		System.out.printf("c=%.2f\n", side_c);
		System.out.printf("ang(a,b)=%.2f\n", angle(side_a, side_b, side_c));
		System.out.printf("ang(a,c)=%.2f\n", angle(side_a, side_c, side_b));
		System.out.printf("ang(b,c)=%.2f\n", angle(side_b, side_c, side_a));
	}
}
