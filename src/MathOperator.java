
public class MathOperator {

	public static void main(String[] args) 
	{
		int a = 12;
		int b = 2;
		
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"^"+b+"="+(Math.pow(a, b)));

	
		double Fahrenheit = celsius2Fahrenheit(24);
		System.out.println("Fahrenheit:"+ Fahrenheit);
		
	}
	public static double celsius2Fahrenheit(double celsius)
	{ 
		double fahrenheit = 1.8 *celsius + 32;	
		return fahrenheit;
		
	}
}
