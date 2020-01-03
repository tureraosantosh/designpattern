package design.pattern.structure.facade;

public class FacadeTests {

	public static void main(String[] args) {
			// -------------------now facade implemention -----------------
		System.out.println(WaiterAsFacade.deliverFood(FoodType.PASTA));
		System.out.println(WaiterAsFacade.deliverFood(FoodType.PIZZA));

	}

}
