import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
public class RGPobserverSubject {
	private List<RGPobserverObserver> observers = new ArrayList<RGPobserverObserver>();
	private String state;
	private String name;
	public String getName() {
		return name;
	}
	public String getState() {
		return state;
	}
	public void setNameState(String name) {
		this.name = name;
		notifyAllObservers();
	}
	public void setPhaseState(String state) {
		this.state = state;
		notifyAllObservers();
	}
	public void attach(RGPobserverObserver observer) {
		observers.add(observer);
	}
	public void deattach(RGPobserverObserver observer) {
		observers.remove(observer);
	}
	public void notifyAllObservers() {
		for(RGPobserverObserver observer : observers) {
			observer.update();
		}
	}
}
