package design.pattern.behavioral.observer;

public class ObserverTests {
	public static void main(String[] args) {
		ScoreBoard sb = new ScoreBoard();
		Observer observer1 = new ObserverImpl("Observer1");
		Observer observer2 = new ObserverImpl("Observer2");
		Observer observer3 = new ObserverImpl("Observer3");

		sb.register(observer1);
		sb.register(observer2);
		sb.register(observer3);
		observer1.subscribe(sb); // both way handshake...
		observer2.subscribe(sb); // both way handshake...
		observer3.subscribe(sb); // both way handshake...
		observer1.update();
	//	sb.postMessage("Lanka vs india at 7pm ");
		sb.unRegister(observer2);
		sb.postMessage("This should not display for 2nd observer ");

	}
}
