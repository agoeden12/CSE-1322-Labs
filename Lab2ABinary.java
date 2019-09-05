import java.util.Random;

// Andrew Goeden

public class Lab2ABinary {

    public static void generateData(int[] data) {
		for (int i = 0; i < data.length; i++) {
			Random random = new Random();
			data[i] = random.nextBoolean() ? random.nextInt(101) : (random.nextInt(101) * -1);
		}
		System.out.println("---Data Generated---");
    }

    private static int binarySearch(int[] data, int key) {
        sort(data);
        
        int low = 0;
        int topOfArray = data.length - 1;
        int injectionPoint = 0;
        while (low <= topOfArray) {
            injectionPoint = low + (topOfArray - low) / 2;

            if (data[injectionPoint] == key) { 
                return injectionPoint;
            } else if (data[injectionPoint] < key) { 
                low = injectionPoint + 1;
            } else { 
                topOfArray = injectionPoint - 1;
            }
        }

        return (injectionPoint + 1) * -1;
    }

    private static void sort(int[] data) {
        int tempValue;
        for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0 && data[j - 1] > data[j]; j--) { 
                tempValue = data[j];
                data[j] = data[j - 1];
                data[j - 1] = tempValue;
            }
        }
    }


    public static void main(String[] args) {
		int[] nums = new int[] {1, 4, 4, 22, -5, 10, 21, -47, 23};
		int[] data = new int[20];

		generateData(data);

		System.out.println(binarySearch(nums, 6));
	}
}