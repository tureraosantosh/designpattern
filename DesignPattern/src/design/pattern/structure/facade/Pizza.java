package design.pattern.structure.facade;

public class Pizza implements Food {

	public String preparedItem;

	@Override
	public void prepareFood(String itemRequired) {
		preparedItem = "MacDonaldas Pizza " + itemRequired;
	}

	@Override
	public String deliveryFood() {
		// TODO Auto-generated method stub
		return preparedItem;
	}

}
