package arrayExamples;

public class ArrayResizingExample3 {

	public static void main(String[] args) {
		
		String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday" };

		//"Sunday, Monday, Tuesday, Wednesday," is printed.
		for (int i = 0; i < days.length; i++) {
			System.out.print(days[i] + ", ");
		}
		
		System.out.println();
		
		String[] temp = new String[7];
		System.arraycopy(days, 0, temp, 0, days.length); //The last 3 cells are null.
		days = temp;
		
		//"Sunday, Monday, Tuesday, Wednesday, null, null, null," is printed.
		for (int i = 0; i < days.length; i++) {
			System.out.print(days[i] + ", ");
		}
		
		System.out.println();
		
		//Adding the last 3 days to the array.
		days[4] = "Thursday";
		days[5] = "Friday";
		days[6] = "Saturday";
		
		
		for (int i = 0; i < days.length; i++) {
			System.out.print(days[i] + ", ");
		}
		
		System.out.println();
	}
}
