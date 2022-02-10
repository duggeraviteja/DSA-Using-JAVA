
import java.util.*;

class Job {
    int id;
    int deadline, profit;

    public Job() {
    }

    public Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    void printJobScheduling(ArrayList<Job> arr, int t) {
        int n = arr.size();
        Collections.sort(arr, (a, b) -> b.profit - a.profit);

        int[] visited = new int[n];
        int count = 0;
        int total = 0;
        for(int i = 0; i < n ; i++){
            for(int j = Math.min(n,arr.get(i).deadline) - 1 ; j >= 0; j--){
                if ( visited[j] == 0){
                    visited[j] = arr.get(i).id;
                    count ++;
                    total += arr.get(i).profit;
                    break;
                }
            }
        }
        System.out.println(count +" "+ total);
    }

    // Driver code
    public static void main(String args[]) {
        ArrayList<Job> arr = new ArrayList<Job>();

        arr.add(new Job(121, 2, 100));
        arr.add(new Job(102, 1, 19));
        arr.add(new Job(103, 2, 27));
        arr.add(new Job(104, 1, 25));
        arr.add(new Job(105, 3, 15));

        Job job = new Job();
        job.printJobScheduling(arr, arr.size());
    }
}

