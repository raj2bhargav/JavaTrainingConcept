package OOPSConcept_Part1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();

		obj.sum();
		obj.sum(10);
		obj.sum(15, 25);

	}

	public void sum() {
		System.out.println("sum method -- zero parameters");
	}

	public void sum(int i) {
		System.out.println("sum method -- one parameter");
		System.out.println(i);
	}

	public void sum(int i, int j) {
		System.out.println("sum method -- two paraemters");
		System.out.println(i + j);
	}

}
