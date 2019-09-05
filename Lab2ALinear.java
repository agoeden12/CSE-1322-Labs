import java.util.Random;

//Andrew Goeden
public class Lab2ALinear {

    public static void generateData(int[] data) {
		for (int i = 0; i < data.length; i++) {
			Random random = new Random();
			data[i] = random.nextBoolean() ? random.nextInt(101) : (random.nextInt(101) * -1);
		}
		System.out.println("---Data Generated---");
    }

    public static int linearSearch(int[] data, int key){		
		for (int i = 0; i < data.length; i++) {
			if(data[i] == key){
                return i;
			}
		}

		return -1;
	}
    
    public static void main(String[] args) {
		int[] nums = new int[] {1, 4, 13, 43, -25, 17, 22, -37, 29};
		int[] data = new int[20];

		generateData(data);

        int result = linearSearch(nums, 13);
		System.out.println(result > -1 ? result : "Value not found in the array");
	}

}
