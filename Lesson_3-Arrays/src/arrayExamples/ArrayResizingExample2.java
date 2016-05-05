package arrayExamples;

public class ArrayResizingExample2 {

	public static void main(String[] args) {

		String[] days = { "Sunday", "Monday", "Friday", "Saturday" };

		for (int i = 0; i < days.length; i++) {
			System.out.print(days[i] + ", ");
		}

		System.out.println();

		String[] temp = new String[7];

		System.arraycopy(days, 0, temp, 0, 2); //Copying only the FIRST 2 cells (indices 0-1) of array days to temp.

		//"Sunday, Monday, null, null, null, null, null," is printed.
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + ", ");
		}

		System.out.println();

		//Copying only the LAST 2 cells (indices 0-1) of array days to temp the 2 last indices of temp (5-6).
		System.arraycopy(days, 2, temp, 5, 2);

		//"Sunday, Monday, null, null, null, Friday, Saturday," is printed.
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + ", ");
		}

		System.out.println();

		days = temp;

		//Adding the remaining days of the week to the days array by creating a new array and copying it. 
		System.arraycopy(new String[] { "Tuesday", "Wednesday", "Thursday" }, 0, days, 2, 3);

		for (int i = 0; i < days.length; i++) {
			System.out.print(days[i] + ", ");
		}

		System.out.println();
	}
}
