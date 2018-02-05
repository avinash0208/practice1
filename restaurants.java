package practice;
import java.util.List;
public class restaurants {

	List<restaurant1> restaurants;
	private int results_found;
	private int results_shown;
	private int results_start;
	public List<restaurant1> getRestaurants() {
		return restaurants;
	}
	public void setRestaurants(List<restaurant1> restaurants) {
		this.restaurants = restaurants;
	}
	public int getResults_found() {
		return results_found;
	}
	public void setResults_found(int results_found) {
		this.results_found = results_found;
	}
	public int getResults_shown() {
		return results_shown;
	}
	public void setResults_shown(int results_shown) {
		this.results_shown = results_shown;
	}
	public int getResults_start() {
		return results_start;
	}
	public void setResults_start(int results_start) {
		this.results_start = results_start;
	}
	
}
