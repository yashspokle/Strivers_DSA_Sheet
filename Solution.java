public class Solution {
    public int GCD(int n1, int n2) {
        int ans = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                ans = i;
            }
        }

        return ans;
    }
} 
