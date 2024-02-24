public class QuadraticFunction {
	private double a,b,c;

	QuadraticFunction (double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getValue(double x) {
		return a*x*x+b*x+c;
	}

	public String getRoots() {
		double d = Math.pow(b, 2) - (4*a*c);
	if (d < 0) {
		return null;
	}
	else if (d == 0) {
		return "one root" + (- b / (2 * a));
	}
	else
		return "two roots" + ( (-b + Math.sqrt(d)) / (2*a) ) + ( (-b - Math.sqrt(d) ) / (2*a) );
	}
 }
