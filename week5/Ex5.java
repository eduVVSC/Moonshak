import java.util.Scanner;

/*
A Pizza restaurant has a variety of Pizzas on its menu. The variety of Pizzas results from the different use of 10 possible ingredients. Each ingredient is identified by a number from 0 to 9.
In this way, each Pizza is identified by an integer whose digits correspond to the ingredients that compose it. For example, Pizza 6501 contains ingredients 0, 1, 5 and 6.
When ordering, the customer declares the ingredients that he does not like or is allergic to, and the restaurant only suggests, among the Pizzas available on the menu, those that do not contain any of these ingredients.

input:
An integer representing ingredients that the customer does not like or is allergic to.
Then, the number of Pizzas (N) in the menu is entered.
Finally, N integers are introduced referring to the N Pizzas in the menu (description of the ingredients of each Pizza).

output:
Show on separate lines each Pizza that satisfies the customer's requirements (which does not contain any ingredient that the customer does not like or is allergic to), in the following format:
Suggestion #<i>:<pizza>

Where <i> is the order of the suggestion sequence and <pizza> is the pizza code.
*/

public class Ex5 {
	public static int display_recommendation(String dont_ingredients, String pizza_flavour, int index)
	{
		int	flag = 0;
		int	i = 0;
		int	j;

		while (i < dont_ingredients.length() && flag == 0)
		{
			j = 0;
			while (j < pizza_flavour.length() && flag == 0)
			{
				if (dont_ingredients.charAt(i) == pizza_flavour.charAt(j))
					flag = 1;
				j++;
			}
			i++;;
		}
		if (flag == 0)
			System.out.printf("Suggestion #%d:%s\n", index, pizza_flavour);
		return flag;
	}

	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		String	dont_ingredients;
		String	pizza_flavour;
		int		print_index = 1;
		int		many_pizzas;
		int		i = 0;

		dont_ingredients = input.next();
		many_pizzas = input.nextInt();
		while (i < many_pizzas)
		{
			pizza_flavour = input.next();
			if (display_recommendation(dont_ingredients, pizza_flavour, print_index) == 0)
				print_index++;
			i++;
		}
	}
}
