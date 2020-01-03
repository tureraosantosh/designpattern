package design.pattern.creation.abstractfactory;

public class MobileFactory extends AbstractDeviceFactory {

	@Override
	Device getGadget(DeviceType deviceType) {
		switch (deviceType) {
		case NOKIA:
			return new Nokia("DDR4 4gb ", " Quad Core i7 ");
			
		case ONEPLUS:
			return new OnePlus("DDR4 8gb ", " Octa Core i5 ");
		
		}
		return null;
	}

}
