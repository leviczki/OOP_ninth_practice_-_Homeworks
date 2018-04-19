package polynomial;

public class LinearPolynomial implements math.Polynomial{

	private double a;
	private double b;
	
	public LinearPolynomial(double a, double b) {

		this.a = a;
		this.b = b;
		
	}

	public String toString() {
		return "y=" +a+ "*x+" +b;
	}

	public double calculate(double x) {
		return ((this.a * x) + this.b);
	}

	public int getDegree() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	
}
