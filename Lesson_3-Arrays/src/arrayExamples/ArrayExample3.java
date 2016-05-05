package arrayExamples;

public class ArrayExample3 {

	public static void main(String[] args) {
		
		String[] names = new String[3];
		
		names[0] = "aaa";
		names[1] = "bbb";
		names[2] = "ccc";
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
