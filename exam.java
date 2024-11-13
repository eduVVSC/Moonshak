import java.util.Scanner;

public class exam {
	public static final int MIN_CAR = 1;
	public static final int MAX_CAR = 10;
	public static final int MIN_TIME = 0;
	public static final int MAX_TIME = 5000;
	public static final int MIN_SPEED = 0;
	public static final int MAX_SPEED = 120;

	public static int valid_input(Scanner input, int max, int min)
	{
		int	num;
		num = input.nextInt();
		while((num > max || num < min))
			num = input.nextInt();
		return num;
	}
	public static double valid_input2(Scanner input, int max, int min)
	{
		double	num;
		num = input.nextDouble();
		while((num > max || num < min))
			num = input.nextDouble();
		return num;
	}


	public static double cal_dist(double speed, double time)
	{
		return (speed * (time / 36));
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double	distance_now;
		double	higher_distance = 0;
		int		eliminted = 0;
		int		car_higher = 0;
		int		many_cars;
		double		speed;
		double		time;

		many_cars = valid_input(input, MAX_CAR, MIN_CAR);
		for (int i = 1; i <= many_cars; i++)
		{
			speed = valid_input2(input, MAX_SPEED, MIN_SPEED);
			time = valid_input2(input, MAX_TIME, MIN_TIME);
			distance_now = cal_dist(speed, time);
			if (time == 0 || speed == 0)
				eliminted++;
			else
			{
				System.out.printf("carro %d : distância = %.1f m \n", i,  distance_now);
				if (higher_distance < distance_now)
				{
					car_higher = i;
					higher_distance = distance_now;
				}
			}
		}
		if (eliminted == many_cars)
			System.out.println("todos os carros foram eliminados");
		else
		{
			System.out.printf("maior distância: carro %d = %.1f m\n", car_higher, higher_distance);
			System.out.printf("carros eliminados = %d\n", eliminted);
		}
	}
}
