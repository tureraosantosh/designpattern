package design.pattern.creation.builder;

public class Shop {
	public static void main(String[] args) {
		Phone p = new PhoneBuilder()
				.setOs("Android")
				.setBattery(3333)
				.setRam(2).getPhone();
		System.out.println(p);
	}
}
