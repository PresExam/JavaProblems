package Practice;

public class MaxMin {
	public static void main(String[] args) {
		int arr[] = { 8, 7, 4, 9, 3 };
		int i, max = arr[0], min = arr[0];
		for (i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
			else if (min > arr[i])
				min = arr[i];
		}
		System.out.print("\t max value : " + max);
		System.out.print("\n\t min value : " + min);
	}
}