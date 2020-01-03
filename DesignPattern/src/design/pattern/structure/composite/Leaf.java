package design.pattern.structure.composite;

public class Leaf implements Component {

	int price;
	String name;public Leaf() {
		// TODO Auto-generated constructor stub
	}
	

	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}


	@Override
	public void showPrice() {
		System.out.println(name + " : " + "price : " + price);
	}

}
