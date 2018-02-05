package practice;
import java.util.List;
public class Level1 {	
		private int results_found;
		private int results_start;
		private int results_shown;
	    
		public int getResults_found()
		{
			return results_found;
		}
		
		public int getResults_start()
		{
			return results_start;
		}
		
		public int getResults_shown()
		{
			return results_shown;
		}
		
		public List<restaurant1> restaurants;

		public List<restaurant1> getRestaurants() {
			return restaurants;
		}

		public void setRestaurants(List<restaurant1> restaurants) {
			this.restaurants = restaurants;
		}
		

	}

