package Utils;
public class ArrayUtils {
	public static int[] reverse(int[] arr) {
		int i = 0;
		int j;
		for(; i < arr.length/2; i++) {
			j = arr.length - 1 - i;
			int rev = arr[i];
			arr[i] = arr[j];
			arr[j] = rev;
		}
		return arr;
	}
	
	public static String stringifyArray(int[] arr) {
		int i = 0;
		String comma = ", ";
		String j = "";
		for(; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(j);
			}
			System.out.print(arr[i] + comma);
		}
		return j;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		System.out.println(reverse(arr));
		System.out.println(stringifyArray(reverse(arr)));
	}
}