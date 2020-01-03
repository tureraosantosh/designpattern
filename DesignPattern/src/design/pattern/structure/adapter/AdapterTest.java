package design.pattern.structure.adapter;

public class AdapterTest {
	public static void main(String[] args) {

		Person person = new Person("MH43", "23465", "Ac1234321 ,IFSC223344,Name ICICI, city NaviMumbai ");
		System.out.println(person);

		Driver driver = new DriverAdapter(person);
		System.out.println(driver.getCarNo() + " " + driver.getLicencseNo() + " " + driver.getBankAccount());

	}
}
