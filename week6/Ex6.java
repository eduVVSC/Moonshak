import java.util.Scanner;

/*
Write a program to determine volumes of revolution solids. Consider only these types of solids: cylinder, cone and sphere.
For each solid, the type of solid and its dimensions (radius and height if required) will be entered.

The program must be able to function repeatedly until the word "end" is entered as a solid type.

Each result should be presented on separate lines and with two decimal places.

Implement a separate method to calculate the volume of each solid.
*/

public class Ex6
{
	public static final double PI = 3.14159265369;

	public static double cone_volume(Scanner input)
	{
		double	radious;
		double	height;
		double	volume;

		volume = 0;
		radious = input.nextDouble();
		height = input.nextDouble();
		volume = (PI * Math.pow(radious, 2) * height) / 3;
		return (volume);
	}

	public static double sphere_volume(Scanner input)
	{
		double	radious;
		double	volume;

		volume = 0;
		radious = input.nextDouble();
		volume = (4 * PI * Math.pow(radious, 3)) / 3;
		return (volume);
	}

	public static double cylinder_volume(Scanner input)
	{
		double	radious;
		double	height;
		double	volume;

		volume = 0;
		radious = input.nextDouble();
		height = input.nextDouble();
		volume = (PI * Math.pow(radious, 2) * height);
		return (volume);
	}
	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		double	radious;
		double	height;
		String	solid;
		int		flag = 0;


		while (flag == 0)
		{
			solid = input.next();
			switch (solid)
			{
				case "cone":
					System.out.printf("%.2f\n",cone_volume(input));
					break;
				case "cylinder":
					System.out.printf("%.2f\n", cylinder_volume(input));
					break;
				case "sphere":
					System.out.printf("%.2f\n", sphere_volume(input));
					break;
				default:
					flag = 1;
					break ;
			}
		}
	}
}
