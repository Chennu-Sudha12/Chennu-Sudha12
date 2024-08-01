package jpmc;

public class MissingNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,4,5,6};
		int missingNumber = findMissingnumber(array);
		System.out.println("The missing number is: "+ missingNumber);
		}
	public static int findMissingnumber(int[] array) {
		int n = array.length + 1;
		int totalSum = n * (n+1) / 2;
		int arraySum = 0;
		for (int num : array) {
			arraySum += num;
		}
		return totalSum -arraySum;
	}

}
