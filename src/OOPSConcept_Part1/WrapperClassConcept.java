package OOPSConcept_Part1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "100";
		System.out.println(x+20);
		
		//Data Conversion from String to Integer
		int x1 = Integer.parseInt(x);
		System.out.println(x1+30);
		
		String y = "12.34";
		double y1 = Double.parseDouble(y);
		System.out.println(y1 + 10);
		
		String z = "true"; 
		boolean z1 = Boolean.parseBoolean(z);
		System.out.println(z1);
		
		
		int j = 100;
		System.out.println(j+50);
		
		String j1 = String.valueOf(j);
		System.out.println(j1+100);

	}

}


