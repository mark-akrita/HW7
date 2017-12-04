import Animal.Puppy;
import Utils.MyMath;
import Utils.ArrayUtils;

public class Driver {
	static Animal.Puppy puppy1 = new Puppy("Joey");
	static Animal.Puppy puppy2 = new Puppy("Chandler");
	static Animal.Puppy puppy3 = new Puppy("Ross");
	
	static int[] array = {9, 20, 3, 44, 88, 300};
	
	static double numb = 15.4;
	
	public static void main(String[] args) {
		System.out.println(puppy1.getName());
		System.out.println(puppy2.getName());
		System.out.println(puppy3.getName());
		System.out.println(ArrayUtils.stringifyArray(ArrayUtils.reverse(array)));
		System.out.println(MyMath.factorialLoop((int) numb));
	}
	
}