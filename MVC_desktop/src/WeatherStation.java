

import java.util.*;

public class WeatherStation {

	public static void main(String[] args) {
		final Model model = new Model();
		ControllerTrial controller = new ControllerTrial(model);
		
		
		final Timer timer = new Timer();
	      timer.schedule(new TimerTask() {
	        public void run() {
	        	model.setMeasurements("50", "90", "29.0");
	        }
	      }, 5000);
	      
	      final Timer timer2 = new Timer();
	      timer.schedule(new TimerTask() {
	        public void run() {
	        	model.setMeasurements("49", "80", "27.3");
	        }
	      }, 30000);
		
	}
	  
}
