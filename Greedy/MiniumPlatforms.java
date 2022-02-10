import java.util.Arrays;

public class MiniumPlatforms {
    static int requiredPlatforms(int n, int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int cur = 1;
        int max = 1;
        int i = 1, j = 0;
        while (i < n) {
            if (arr[i] > dep[j]) {
                cur--;
                j++;
            } else {
                cur++;
                i++;
            }

            max = Math.max(max, cur);
        }

        return max;

    }

    public static void main(String[] args) {
        int n = 6;
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        System.out.println(requiredPlatforms(n, arr, dep));
    }
}
