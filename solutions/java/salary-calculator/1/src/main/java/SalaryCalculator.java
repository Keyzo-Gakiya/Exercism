public class SalaryCalculator {
	
	private int salary = 1000;
	
    public double salaryMultiplier(int daysSkipped) {
    
    	return daysSkipped >= 5 ? 0.85 : 1;
    	
    } // salaryMultiplier()

    public int bonusMultiplier(int productsSold) {
        
    	return productsSold >= 20 ? 13 : 10;
    	
    } // bonusMultiplier()

    public double bonusForProductsSold(int productsSold) {
        
    	return productsSold * bonusMultiplier(productsSold);
    	
    } // bonusForProductsSold()

    public double finalSalary(int daysSkipped, int productsSold) {
    
    	int finalSalary = (int) (salary * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold));
    	
    	return finalSalary <= 2000 ? finalSalary : 2000;
    	
    } // finalSalary()
    
} // class SalaryCalculator
