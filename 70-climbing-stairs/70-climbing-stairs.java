class Solution {
    
    static int[]dp;
    public int climbStairs(int n) {
            dp = new int[n+1];
            return solve(n);
    }
    
    
     public int solve(int x){
        if(x==1)
            return 1;
        if(x==2)
            return 2;
        
        if(dp[x]!=0 )
            return dp[x];
         
        return dp[x] = solve(x-1)+solve(x-2);
    }
}