package design.pattern.behavioral.stratergy;

public class StartergyTests {

	public static void main(String[] args) {

		Player terreriost = new Player("Counter Terrorist ");
		Player counterTerreriost = new Player("Counter Terrorist ");

		System.out.println("Befor bomb is planted ");
		terreriost.setStratergy(new Attacking());
		counterTerreriost.setStratergy(new Defensive());
		terreriost.action();
		counterTerreriost.action();

	}

}
