public class Solution {
    public static int climbStairs(int n) {
        if(n==1) return 1;
        int[] possibilities = new int[n+1];
        possibilities[0] = 0;
        possibilities[1] = 1;
        possibilities[2] = 2;
        for (int i = 3; i <= n ; i++) {
            possibilities[i] = possibilities[i-1] + possibilities[i-2];
        }
        return possibilities[n];
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
