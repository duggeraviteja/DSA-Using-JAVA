import java.util.*;
public class LongestCommonSubsequence {
    static int LCS(String s1, String s2){

        int m = s1.length();
        int n = s2.length();
        int dp[][] = new int[m+1][n+1];

        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=n; j++) {

                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+ dp[i-1][j-1];
                } else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
                
            }
        }





        int index = dp[m][n];
        int temp = index;
   
        char[] lcs = new char[index+1];
      //  lcs[index] = '\u0000'; 
        int i = m;
        int j = n;
        while (i > 0 && j > 0)
        {
            if (s1.charAt(i-1) == s2.charAt(j-1))
            {
                lcs[index-1] = s1.charAt(i-1); 
                  
                i--; 
                j--; 
                index--;     
            }
            else if (dp[i-1][j] > dp[i][j-1])
                i--;
            else
                j--;
        }
           for(int k=0;k<=temp;k++) {
            System.out.print(lcs[k]);
           }
            // System.out.println(Arrays.toString(lcs));
System.out.println(" ");



        return dp[s1.length()][s2.length()];

    }

    static int spaceOptimisedLcs(String s1, String s2){

        int m = s1.length();
        int n = s2.length();

        int dp[][] = new int[2][s2.length() +  1];

        for (int i = 0; i <=s1.length(); i++) {
            for (int j = 0; j <=s2.length(); j++) {
                if(i == 0 || j==0){
                    dp[i%2][j] = 0;
                }
               else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i%2][j] = 1 + dp[(i+1)%2][j-1];
                } else {
                    dp[i%2][j] = Math.max(dp[i%2][j-1],dp[(i+1)%2][j]);
                }
            }
        }

      //  System.out.println(Arrays.deepToString(dp));
        return dp[m%2][s2.length()];
    }


    
    public static void main(String[] args) {
        String s1 = "aaaaa";
        String s2 = "aaaa";
        System.out.println(LCS(s1,s2));


        System.out.println(spaceOptimisedLcs(s1,s2));
    }
    
}
