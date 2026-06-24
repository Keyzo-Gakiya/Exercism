public class JedliksToyCar {
	
	private int metersDriven = 0;
	private int batteryRemaining = 100;
	
    public static JedliksToyCar buy() {
    	
        return new JedliksToyCar();
        
    } // buy()

    public String distanceDisplay() {
    	
    	return String.format("Driven %d meters", metersDriven);
    	
    } // distanceDisplay()

    public String batteryDisplay() {
    	
        return batteryRemaining > 0 ? String.format("Battery at %d%%", batteryRemaining) : "Battery empty";
        
    } // batteryDisplay()

    public void drive() {
    	
    	if (batteryRemaining > 0) {
    		
    		metersDriven += 20;
    		batteryRemaining--;    		
    	
    	}
    	
    } // drive()
    
} // class JedliksToyCar
