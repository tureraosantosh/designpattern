package design.pattern.creation.abstractfactory;

public class FactoryGenerator {

	public static AbstractDeviceFactory getFactory(FactoryType factoryType) {
		switch (factoryType) {
		case MOBILEJFACTORY:
			return new MobileFactory();

		case LAPTOPFACTORY:
			return new LaptopFactory();
		}
		return null;
	}
}
