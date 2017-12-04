package Utils;
public class MyMath {
	
	static int factorial(int n) {
		if (n<=1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
		
	public static int factorialLoop(int n) {
		int j = 1;
		int i = 1;
		while ( i <= n) {
			//if (n == 0) {return 1;}
			j = j * i;
			i++;
		}
		return j;
	}
	
	public static void main(String[] args) {
		System.out.println("recursive: "+ factorialLoop(6) + ", " + "loop: " + factorialLoop(6));
	}
}