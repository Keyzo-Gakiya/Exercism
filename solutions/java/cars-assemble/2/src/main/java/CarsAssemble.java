public class CarsAssemble {

    final int minutes = 60;
    
    public double productionRatePerHour(int speed) {
        	double rate = 0.0;
    	
    	if (speed > 9) {
    		rate = 0.77;
    	} else if (speed > 8) {
    		rate = 0.8;
    	} else if (speed > 4 ) {
    		rate = 0.9;
    	} else {
    		rate = 1.0;
    	}
    	
    	return (speed * 221) * rate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / minutes); 
    }
}
