package polynomial;

public class Test {
	
	public static void drawPolynomialTable(LinearPolynomial test) {
		
		for(double i = 0; i <= 1; i += 0.1) {
			
			System.out.print(test.calculate(i) + ", ");
			
		}
	}
	
	
	public static void main(String[] args) {
		
		LinearPolynomial[] array = new LinearPolynomial[2];
		
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println("Enterrel elvalasztva kerem az [+(i+1)+] a es b erteket: ");
			array[i] = new LinearPolynomial(input.nextDouble(), input.nextDouble());
			
		}
		
		input.close();
		
		
		for(LinearPolynomial one : array)
			System.out.println(one.toString());
		
		
		drawPolynomialTable(array[(array.length-1)]);
		
	}
}
