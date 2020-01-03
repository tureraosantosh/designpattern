package design.pattern.creation.singletone;

public class SingleToneTests {

	public static void main(String[] args) {
		Singletone s1 = Singletone.getInstance();
		Singletone s2 = Singletone.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
	}
}
