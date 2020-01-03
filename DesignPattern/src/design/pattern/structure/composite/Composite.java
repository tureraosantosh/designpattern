package design.pattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	List<Component> components = new ArrayList<>();

	String name;

	public Composite() {
		// TODO Auto-generated constructor stub
	}

	public Composite(String name) {

		this.name = name;
	}

	@Override
	public void showPrice() {

		System.out.println(name);
		for (Component c : components) {
			c.showPrice();
		}
	}

	public void addComponent(Component component) {
		components.add(component);
	}
}
