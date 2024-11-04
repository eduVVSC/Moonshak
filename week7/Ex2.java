import java.util.Scanner;

/*
Write a program that simulates a game of dice in which a player toss a die a set of times. The player's score is the sum of the faces alue of the die. The faces of the die are numbered from 1 to 6. If two consecutive equal faces come out, the score becomes negative. When one face is the same as the previous one, the points of the second face are negative, otherwise they are positive.
The program must read a positive integer, whose digits represent the consecutive value of the faces, and display the final score.

Implement a method that takes an integer as a parameter and returns the corresponding score, according to the rules of the game.

examples:
3165: 3 > (3) + 1 > (4) + 6 > (10) + 5 > (15)
344: 3 > (3) + 4 > (7) + 4 > (-7) - 4 > (-11)
34414: 3 > (3) + 4 > (7) + 4 > (-7) - 4 > (-11) + 1 > (-10) + 4 > (-6)

*/

public class Ex2 {
	public static int calculate_num(String num)
	{
		int	sum;
		int	strlen;
		int	side = 1;
		int	sign = 0;

		sum = (int)num.charAt(0) - '0';
		strlen = num.length();
		for (int i = 1; i < strlen; i++)
		{
			if (num.charAt(i) == num.charAt(i - 1))
			{
				if(sign == 0)
				{
					sum = sum * (-1);
					sign++;
				}
				sum += (-1) * ((int)num.charAt(i) - '0');
			}
			else
				sum += (int)num.charAt(i) - '0';
		}
		return (sum);
	}

	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		String	num;


		num = input.next();
		System.out.println("points=" + calculate_num(num));
	}
}
