package OOPConceptPart2;

public class HSBCBank implements USBank{

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("hsbc--credit");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("hsbc--debit");
	}

	@Override
	public void transferMoney() {
		// TODO Auto-generated method stub
		System.out.println("hsbc--transferMoney");
	}
	
	public void educationLoan() {
		System.out.println("hsbc--education Loan");
	}
	
	public void carLoan() {
		System.out.println("hsbc--car Loan");
	}

}
