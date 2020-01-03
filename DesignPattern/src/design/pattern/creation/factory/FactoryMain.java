package design.pattern.creation.factory;

public class FactoryMain {
	public static void main(String[] args) {

		OS obj = new OSFactory().getInstance("secure");
		obj.spec();
	}
}
