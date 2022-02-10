
public class Count_Palindromic_SubSeq {
    static int Solution(String s){
        int dp[][] = new int[s.length()][s.length()];
        for (int g = 0; g < dp.length; g++) {
            for (int i = 0, j=g; j < dp.length; i++,j++) {
                if(g==0){
                    dp[i][j] = 1;
                } else if(g==1) {
                    dp[i][j] = s.charAt(i) == s.charAt(j) ? 3:2;
                } else {
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = dp[i][j-1] + dp[i+1][j] +1;
                    } else {
                        dp[i][j] = dp[i][j-1] + dp[i+1][j] -dp[i+1][j-1];
                    }
                }
            }
            
        }
        return dp[0][dp[0].length-1]; //dp[0].length ==  s.length()-1;
    }
    public static void main(String[] args) {
        String s = "aaaa";
        System.out.println(Solution(s));
    }
}
