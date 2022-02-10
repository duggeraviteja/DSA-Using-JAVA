import java.util.*;

public class Lngst_Palindromic_Sub_String {

    static int lpssLength(String s) {

        boolean dp[][] = new boolean[s.length()][s.length()];
        int len = 0;
        for (int g = 0; g < s.length(); g++) {
            for (int i = 0, j = g; j < s.length(); i++, j++) {
                if (g == 0) {
                    dp[i][j] = true;
                } else if (g == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                } else {
                    if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == true) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                }
                if (dp[i][j]) {
                    len = g + 1;
                }
            }
        }

        return len;
    }

    static String lpssString(String s) {

        int low, high;
        int start = 0;
        int end = 1;
        // even palindrome

        for (int i = 1; i < s.length(); i++) {
            low = i - 1;
            high = i;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > end) {
                    start = low;
                    end = high - low + 1;
                }
                low--;
                high++;
            }
            // odd palindrome
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 == end) {
                    start = low;
                    end = high - low + 1;
                }
                low--;
                high++;
            }

        }
       // String ans = print(s,start,start+end-1);

        return print(s,start,start+end-1);
    }

    static String print(String s,int start,int end){
        String ans="";
        for (int i = 0; i < s.length(); i++) {
            ans += s.charAt(i);
        }
        return ans;
    }
  
  
    static String longestPalin(String S){
        // code here
        String lps = "";
       int max = Integer.MIN_VALUE; 
       
       for(int i = 0 ; i <= S.length() ; i++){
           for(int j = i+1 ; j <= S.length() ; j++){ 
            if(Ispalindrome( S.substring(i,j) ) && S.substring(i,j).length()>max){
                max = S.substring(i,j).length();   
                lps = S.substring(i,j);  
            }
           }        
       }
       return lps;
   }
   
   static boolean Ispalindrome(String s){
       int i = 0 ; int j = s.length()-1;
       while(i<j){
           if(s.charAt(i)!=s.charAt(j)){
               return false;
           }
           i++;
           j--;
       }
       return true;
    }

    static int Lonpalin(String s){

        int n = s.length();
      int dp[][] = new int[n][n];

      for (int i = 0; i < n; i++)
      dp[i][i] = 1;

      for (int i =n-2; i >= 0; i--) {
          for (int j = i+1; j < n; j++) {
              if(s.charAt(i) == s.charAt(j)){
                  dp[i][j]= 2 + dp[i+1][j-1] ;
              } else 
              dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
          }
      }

      return dp[0][n-1];
    }
    public static void main(String[] args) {
        String s = "bbabcbcab";

        // Using DP length
    //  System.out.println(lpssLength(s));

        // sub String 
       System.out.println(lpssString(s));

        // System.out.println(longestPalin(s));

        // this is not substring or continous  
        System.out.println(Lonpalin(s));



    }
}
