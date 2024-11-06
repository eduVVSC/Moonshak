/*
Consider a completely occupied apartment building with 3 entrances and 4 floors.
Write a modular program to:
-First, read the name of the owner of each apartment. The reading should be done in order of entrance and floor, ie, for each entrance must be read the owners of each of its floors;
-Second, read a particular name and display which entrance and floor it owns, in the following format:

"name=<name>"
"entrance=<entrance number>"
"floor=<floor number> "

If there are multiple solutions (multiple owners with the same name), all possibilities should be displayed, in ascending order of entrance and floor.
If there is no owner with that name in the building, the message “Do not live in the building” should be displayed.

Example:
floor

3 	Luisa Lima
	Hercilia Hora 	Maria Mota
2 	Carla Costa 	Gloria Gomes 	Luisa Lima
1 	Berta Barata 	Francisca Fe
	Joana Jales
0 	Ana Anacleta 	Elsa Eira 	Ines Iris

	0 	1 	2

	entrance
*/

import java.util.Scanner;

public class Ex9 {
	public static final int	ENTRENCE = 3;
	public static final int	FLOOR = 4;

	public static void main(String[] args)
	{
		Scanner		input = new Scanner(System.in);
		String[][]	names;

		names = new String[FLOOR][ENTRENCE];
		for (int i = 0; i < 3; i++)
		{

		}
	}
}
