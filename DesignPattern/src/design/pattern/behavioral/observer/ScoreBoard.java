package design.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ScoreBoard implements Board {

	private List<Observer> observers;
	private String message;
	private boolean changed;

	public ScoreBoard() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer observer) {
		if (observer == null) {
			throw new NullPointerException("NULL Observer registered");

		}

		if (!observers.contains(observer)) {
			observers.add(observer);
		}
	}

	@Override
	public void unRegister(Observer observer) {

		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {

		if (!changed) {
			return;
		} else {
			this.changed = false;
			for (Observer obs : observers) {
				obs.update();
			}
		}
	}

	@Override
	public Object getUpdate(Observer observer) {
		// TODO Auto-generated method stub
		return this.message;
	}

	public void postMessage(String msg) {

		System.out.println(msg);
		this.message = msg;
		this.changed = true;
		notifyObserver();
	}

}
