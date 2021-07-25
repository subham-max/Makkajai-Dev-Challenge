public class Main {

	public static void main(String[] args) {
		
		Receipt r1 = new Receipt("test1.txt");	
		
		r1.calculateTotals();
		
		System.out.println("Output 1");
		r1.printReceipt();
		System.out.println();

		Receipt r2 = new Receipt("test2.txt");

		r2.calculateTotals();
		
		System.out.println("Output 2");
		r2.printReceipt();
		System.out.println();
		
		Receipt r3 = new Receipt("test3.txt");
		
		r3.calculateTotals();
		
		System.out.println("Output 3");
		r3.printReceipt();
		
	}

}
