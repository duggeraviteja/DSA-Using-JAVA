import java.util.*;

public class Frequences {
	static void countFreq(int[] arr, int n) {
		Map<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}

		System.out.println(mp);
		int max = 0;

		mp.forEach((k, v) -> System.out.println("Key = "
				+ k + " Value = " + v));

	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 10, 10, 20, 5, 20 };
		int n = arr.length;
		countFreq(arr, n);

	}
}
