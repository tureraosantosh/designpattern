package design.pattern.creation.abstractfactory;

public class LaptopFactory extends AbstractDeviceFactory {

	@Override
	Device getGadget(DeviceType deviceType) {
		switch (deviceType) {
		case HP:
			return new Hp("DDR4 4gb ", " Intel i7 ");

		case DELL:
			return new Dell("DDR4 8gb ", " Intel i5 ");

		}
		return null;
	}

}
