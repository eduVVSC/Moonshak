import java.util.Scanner;

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
