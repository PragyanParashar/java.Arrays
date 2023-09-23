import java.io.*;

 public class repeated {

	static void printTwoElements(int[] arr, int n)
	{
		int[] temp = new int[n]; 
		int repeating = -1;
		int missing = -1;

		for (int i = 0; i < n; i++) {
			temp[arr[i] - 1]++;
			if (temp[arr[i] - 1] > 1) {
				repeating = arr[i];
			}
		}
		for (int i = 0; i < n; i++) {
			if (temp[i] == 0) {
				missing = i + 1;
				break;
			}
		}

        

		System.out.println("The repeating number is "
						+ repeating + ".");
		System.out.println("The missing number is "
						+ missing + ".");
	}

	public static void main(String[] args)
	{
		int[] arr = { 7, 3, 4, 5, 5, 6, 2 };
		int n = arr.length;
		printTwoElements(arr, n);
	}
}


