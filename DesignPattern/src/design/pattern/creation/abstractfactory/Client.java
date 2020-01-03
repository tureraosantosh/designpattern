package design.pattern.creation.abstractfactory;

public class Client {
	public static void main(String[] args) {
		Device dell = FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORY).getGadget(DeviceType.DELL);
		System.out.println(dell.getDetails());
		AbstractDeviceFactory mobileFactory = FactoryGenerator.getFactory(FactoryType.MOBILEJFACTORY);
		Device onePlus = mobileFactory.getGadget(DeviceType.ONEPLUS);
		System.out.println(onePlus.getDetails());
	}

}
