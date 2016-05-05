package arrayExamples;

public class ArrayStaticInitializationExample2 {

	public static void main(String[] args) {
		double[] nums = { 3.5, 2.2, 4.25 };
		double sum = sum(nums);
		System.out.println(sum);

		System.out.println(sum(new double[] { 2, 4, 6, 12 }));
	}

	public static double sum(double[] nums) {

		double sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}

		return sum;
	}

}
