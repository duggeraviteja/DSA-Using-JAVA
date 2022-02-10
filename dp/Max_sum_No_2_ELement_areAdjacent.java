public class Max_sum_No_2_ELement_areAdjacent {
    static int MaxSum(int[]  arr){

        int include = arr[0];
        int exclude = 0;
        int excludeNew = 0;
        for (int i = 1; i < arr.length; i++) {
            excludeNew = Math.max(include, exclude);
            include = exclude + arr[i];
            exclude = excludeNew;
        }
        return Math.max(include,exclude);
    }
    public static void main(String[] args) {
        int arr[] = { 5,5,10,100,10,5};
        System.out.println(MaxSum(arr));
    }
}
