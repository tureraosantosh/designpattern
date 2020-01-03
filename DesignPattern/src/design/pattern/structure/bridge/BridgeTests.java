package design.pattern.structure.bridge;

public class BridgeTests {

	public static void main(String[] args) {

		Automobile bus = new Bus(new Produce(), new Assamble());
		bus.manufacture();
/*		Automobile taxi = new Taxi(new Produce(), new Assamble());
		taxi.manufacture();*/
	}

}
