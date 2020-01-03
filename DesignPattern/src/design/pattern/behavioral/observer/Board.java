package design.pattern.behavioral.observer;

public interface Board {

	void register(Observer observer);

	void unRegister(Observer observer);
	void notifyObserver();
	Object getUpdate(Observer observer);
}
