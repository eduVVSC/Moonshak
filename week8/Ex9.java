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

3 	Luisa Lima 			Hercilia Hora 		Maria Mota
2 	Carla Costa 		Gloria Gomes 		Luisa Lima
1 	Berta Barata 		Francisca F 		Joana Jales
0 	Ana Anacleta 		Elsa Eira 			Ines Iris
	0 						1 					2

	entrance
*/

import java.util.Scanner;

public class Ex9 {
	public static final int	ENTRENCE = 3;
	public static final int	FLOOR = 4;

	public static void	print_found(String name, int floor, int entrence)
	{
		System.out.printf("name=%s\n", name);
		System.out.printf("entrence=%d\n", entrence);
		System.out.printf("floor=%d\n", floor);
	}

	public static void	searching(String[][] names, String name_search)
	{
		boolean	found = false;

		for (int i = 0; i < ENTRENCE; i++)
		{
			for (int j = 0; j < FLOOR; j++)
			{
				if(names[j][i].equals(name_search))
				{
					print_found(name_search, i, j);
					found = true;
				}
			}
		}
		if (found == false)
			System.out.println("Do not live in the building");
	}

	public static void	main(String[] args)
	{
		Scanner		input = new Scanner(System.in);
		String		name_search;
		String[][]	names;

		names = new String[FLOOR][ENTRENCE];
		for (int i = 0; i < ENTRENCE; i++)
			for (int j = 0; j < FLOOR; j++)
				names[j][i] = input.nextLine();
		name_search = input.nextLine();
		searching(names, name_search);
	}
}


// 0 0 -> 1 0 ->  2 0 -> 3 0
