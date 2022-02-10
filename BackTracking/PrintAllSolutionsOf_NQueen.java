import java.util.ArrayList;


public class PrintAllSolutionsOf_NQueen {

    static ArrayList<ArrayList<Integer>> result;
    static int[] row = new int[10];
    static int k = 0;
    
    static boolean place(int r,int c) {
    	for(int prev=0;prev<c;prev++)
    		if(row[prev]==r ||(int)Math.abs(row[prev]-r) == (int)Math.abs(prev-c))
    			return false;
    	return true;
    }

    static void solveNQ(int c,int n) {
    	if(n == 2 || n == 3) 
    	    return;
    	if(c == n) {
    		
    		ArrayList<Integer> v = new ArrayList<Integer>();
    		
    		for(int i = 0;i < n;i++)
    		    v.add(row[i]+1);
    		result.add(v);
    		k++;
    	}
    	
    	for(int i = 0;i < n;i++) {
    		if(place(i, c)) {
    			row[c] = i;
    			solveNQ(c+1, n);
    		}
    	}
    }
  
    public static void main(String[] args) {
        int n = 4;
        result = new ArrayList<ArrayList<Integer>>();
        solveNQ(0, n);
        System.out.println(result );  
 
    }
}
