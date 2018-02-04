import java.util.Arrays;

public class InsertionSort {
	public static void insertSort(int[] data) {
		for (int i = 1; i < data.length; ++i) {
			int key = data[i];
			int j = i - 1;
			for (; j >= 0 && data[j] > key; --j) 
				data[j + 1] = data[j];
			data[j + 1] = key;
		}
	}
	public static void main(String[] args) {
		int[] data = {9, 4, 6, 0, 7, 3, 9, 4, 5};
		System.out.println("Before Sort: " + Arrays.toString(data));
		insertSort(data);
		System.out.println("After Sort: " + Arrays.toString(data));
	}
}
