package arrayExamples;

public class TwoDimensionalArrayExample {

	public static void main(String[] args) {

		//2 dimensional array. Only the first dimension size has to be initialised.
		int[][] arr2Dim = new int[3][];
		//The other dimensions don't have to be the same size.
		arr2Dim[0] = new int[2];
		arr2Dim[1] = new int[10];
		arr2Dim[2] = new int[5];


		for (int i = 0; i < arr2Dim.length; i++) {
			for (int j = 0; j < arr2Dim[i].length; j++) {
				arr2Dim[i][j] = (int) (Math.random() * 11);
				System.out.print(arr2Dim[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
