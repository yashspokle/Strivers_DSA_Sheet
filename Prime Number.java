class Solution {
    public boolean isPrime(int n) {
         for(int i = 2; i < n; i++){
            if(n % i == 0 || n >= 1){
                return false;
            }
         }
       
         return true;
    }
}