import java.util.Arrays;
class MergeSort {
	public static void mergeSort(int[] data, int p, int r) {
		if (p < r) {
			int q = p + (r - p) / 2;
			mergeSort(data, 0, q);
			mergeSort(data, q + 1, r);
			merge(data, p, q, r);
		}
	}
	
	private static void merge(int[] data, int p, int q, int r) {
		int[] L = new int[q - p + 2];
		int[] R = new int[r - q + 1];
		for (int i = p; i <= q; ++i)
			L[i - p] = data[i];
		L[q - p + 1] = Integer.MAX_VALUE;
		for (int i = q + 1; i <= r; ++i)
			R[i - q - 1] = data[i];
		R[r - q] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		for (int z = p; z <= r; ++z) {
			if (L[i] <= R[j]) 
				data[z] = L[i++];
			else 
				data[z] = R[j++];
		}
	}
	
	public static void main(String[] args) {
		int[] data = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println(Arrays.toString(data));
		mergeSort(data, 0, data.length - 1);
		System.out.println(Arrays.toString(data));
	}
}