package arrayExamples;

public class ArrayExample2 {

	public static void main(String[] args) {

		// creating an array object
		int[] grades = new int[10];
		int sum = 0;

		for (int i = 0; i < grades.length; i++) {
			grades[i] = (int) (Math.random()*101);
			System.out.print(grades[i] + ", ");
			sum += grades[i];
		}
		System.out.println();
		
		double avg = sum / (double)grades.length;
		System.out.println("number of grades: " + grades.length);
		System.out.println("average: " + avg);
	}

}
