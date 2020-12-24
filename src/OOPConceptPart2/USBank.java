package OOPConceptPart2;

public interface USBank {
	
	
	//Only method declaration
	//no method body -- only method prototype
	//In Interface, we can declare the variables, vars are by default static in nature
	//vars value will not be changed
	//no static method in Interface
	//no main method in Interface
	//we can not create the object in Interface
	//Interface is abstract in nature
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	

}
