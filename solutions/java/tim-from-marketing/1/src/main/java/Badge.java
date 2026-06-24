class Badge {
	
    public String print(Integer id, String name, String department) {
    	
    	if (department == null)
    		department = "OWNER";
    	
    	return id != null ?  String.format("[%d] - %s - %s", id, name, department.toUpperCase()) : String.format("%s - %s", name, department.toUpperCase());	
    	
    } // print()
    
} // class Badge
