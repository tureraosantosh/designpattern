package design.pattern.structure.facade;

public class WaiterAsFacade {

	public static String deliverFood(FoodType foodType) {
		Ingredient ingredient = new Ingredient();

		switch (foodType) {
		case PIZZA:
			Food pizza = new Pizza();
			String pizzItems = ingredient.getPizzItems();
			pizza.prepareFood(pizzItems);

			return pizza.deliveryFood();
		case PASTA:
			Food past = new Pasta();
			String pastItems = ingredient.getPastItems();
			past.prepareFood(pastItems);

			return past.deliveryFood();
		}
		return null;
	}

}
