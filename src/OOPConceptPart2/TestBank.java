package OOPConceptPart2;

public class TestBank {
	
	public static void main(String[] args) {
		
		//Dynamic Polymorphism
		HSBCBank hs = new HSBCBank();
		
		hs.credit();
		
		hs.debit();
		
		hs.carLoan();
		
		hs.educationLoan();
		
		hs.transferMoney();
		
		System.out.println(USBank.min_bal);
	}

}
