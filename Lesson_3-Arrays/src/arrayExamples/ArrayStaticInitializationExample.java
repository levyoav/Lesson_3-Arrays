package arrayExamples;

public class ArrayStaticInitializationExample {

	public static void main(String[] args) {

		int[] arr1 = { 2, 4, 7, 3, 1 };

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println();
		String[] arr2 = { "aaa", "bbb", "ccc" };

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
