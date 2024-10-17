import java.util.Scanner;


// recebo o:
//	1o -> ingrediente que nao quer
//	2o -> numero de pizzas
//	3o ->
public class Ex5 {
	public static int display_recommendation(String dont_ingredients, String pizza_flavour, int index)
	{
		int	flag = 0;
		int	i = 0;
		int	j;

// loop checando os ingredientes na pizza
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
