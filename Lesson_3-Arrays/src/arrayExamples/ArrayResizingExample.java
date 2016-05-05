package arrayExamples;

public class ArrayResizingExample {

	public static void main(String[] args) {

		int[] nums = { 2, 4, 6 }; //Static initialisation of array nums.

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}

		int[] temp = new int[nums.length + 2]; //Creating a new int array longer from nums by 2.
		
		//Copying the array num to the longer array temp for resizing.
		//Parameters meaning by order:
		//1 - The source array to be copied from (nums).
		//2 - The index of the source array from which to start copying from (0).
		//3 - The target array to copy to (temp).
		//4 - The index of the target array from which to start copying to (0).
		//5 - The number of cells to be copied starting from the given index (nums.length).
		System.arraycopy(nums, 0, temp, 0, nums.length);
		
		//Assigning the copied array to nums. This is actually resizing the array nums to be longer by 2
		//cells, that now hold the default int value 0. 
		nums = temp;
		temp = null;

		System.out.println();
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
	}
}
