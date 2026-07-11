public class Armstrong {
    public boolean isArmstrong(int n) {
        int real = n;
        int sum = 0;
        while(n > 0){
            int x = n % 10;
            sum = sum + (x*x*x);
            n = n / 10;
            
        }
        return (sum  == real);
    }
} 
    
