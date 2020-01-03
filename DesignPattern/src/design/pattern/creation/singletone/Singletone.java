package design.pattern.creation.singletone;

public class Singletone {
	private static Singletone initSingltone = null;

	private Singletone() {
	}

	public static Singletone getInstance() {
		synchronized (Singletone.class) {
			if (initSingltone == null) {
				initSingltone = new Singletone();
			}
		}

		return initSingltone;
	}
}
