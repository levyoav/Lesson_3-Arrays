package arrayExamples;

public class TwoDimensionalArrayExample2 {

	public static void main(String[] args) {

		int[][] matrix = new int[3][5];

		 System.out.println(matrix[1][4]); //0 is printed (int default value).
		 matrix[1][4] = 5;
		 System.out.println(matrix[1][4]); //5 is printed.

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 11);
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
