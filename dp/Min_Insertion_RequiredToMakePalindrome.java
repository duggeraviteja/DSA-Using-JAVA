public class Min_Insertion_RequiredToMakePalindrome {
    static int FormPalindrome(String s) {
      int dp[][] = new int[s.length()][s.length()];

      for (int gap = 0; gap < dp.length; gap++) {
          for (int j =gap, i=0; j < dp.length; j++,i++) {
              if(gap == 0){
                  dp[i][j] = 1;
              } else {
                  if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i-1][j-1] + 2;
                  } else {
                    dp[i][j]  = Math.max(dp[i+1][j],dp[i][j-1]);
                  }
              }
          }
      }

        return s.length() - dp[0][s.length()-1];
    }


    static int Solution(char[] s ){

        int n = s.length;
        int dp[][] = new int[n][n];

        for (int g = 1; g < dp.length; g++) {
            for (int i=0,j = g; j < dp.length; j++,i++) {
                
                dp[i][j] = (s[i] == s[j]) ? dp[i+1][j-1] : 
                (Math.min(dp[i][j-1],dp[i+1][j]) +1 );
            }
        }
        return dp[0][n-1];
    }


    public static void main(String[] args) {
        String s = "abcd"; //3

       // System.out.println(FormPalindrome(s));
        System.out.println(Solution(s.toCharArray()));
    }
}
