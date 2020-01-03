package design.pattern.behavioral.observer;

public class ObserverImpl implements Observer {

	private String name;
	private Board board;

	public ObserverImpl(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		String message = (String) board.getUpdate(this);
		if (message == null) {
			System.out.println("No New Message : ");
		} else {
			System.out.println(name + " :Consuming message -> " + message);
		}
	}

	@Override
	public void subscribe(Board board) {
		this.board = board;
	}

}
