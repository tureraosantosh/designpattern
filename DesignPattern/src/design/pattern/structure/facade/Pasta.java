package design.pattern.structure.facade;

public class Pasta implements Food {

	public String preparedItem;
	@Override
	public void prepareFood(String itemRequired) {
		preparedItem=" Pasta perpared with "+itemRequired;
		
	}

	@Override
	public String deliveryFood() {
		// TODO Auto-generated method stub
		return preparedItem;
	}

}
