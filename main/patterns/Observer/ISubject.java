package patterns.Observer;

public interface ISubject {
	void addObserver(IObserver obj);
	void deleteObserver(IObserver obj);
	void notifyObserver();
	

}
