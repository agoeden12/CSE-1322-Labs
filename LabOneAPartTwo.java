import java.util.Random;

//Andrew Goeden
public class LabOneAPartTwo {
	
	public static int findLargest(int[] arr) {
		int largestNumber = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > largestNumber){
				largestNumber = arr[i];
			}
		}

		return largestNumber;
	}

	public static void generateData(int[] data) {
		for (int i = 0; i < data.length; i++) {
			Random random = new Random();
			data[i] = random.nextBoolean() ? random.nextInt(101) : (random.nextInt(101) * -1);
		}
		System.out.println("---Data Generated---");
	}

	public static int findLongestStreak(int[] data) {
		int count = 0;
		int largestCount = 0;

		System.out.println("---Started Finding Longest Streak---");
		for (int i = 0; i < data.length; i++) {
			if(data[i] > 0){
				count++;
			} else {
				count = 0;
			}
			largestCount = count > largestCount ? count : largestCount;
		}
		System.out.println("---Finished Finding Longest Streak---");

		return largestCount;
	}

	public static void main(String[] args) {
		int[] nums = new int[] {1, 1, 13, 22, -25, 22, 21, 23, 22};
		int[] data = new int[20];

		generateData(data);
		System.out.println("---Printing Data---");
		for (int var : data) {
			System.out.println(var);
		};
		System.out.println("---Finished Printing Data---");

		System.out.println(findLongestStreak(nums));

		System.out.println("---Sum of Largest Integer in Nums and Data---");
		System.out.println(findLargest(nums) + findLargest(data));
	}
}
