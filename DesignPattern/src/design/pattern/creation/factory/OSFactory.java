package design.pattern.creation.factory;

public class OSFactory {
	public OS getInstance(String str) {
		if (str.equals("open")) {
			return new Android();
		} else if (str.equalsIgnoreCase("secure")) {
			return new IOS();
		} else {
			return new Windows();
		}
	}

}
