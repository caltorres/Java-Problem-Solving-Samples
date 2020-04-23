class Solution {
    public boolean isArmstrong(int N) {
        if(N == findSumOfDigitsToPower(N)){
            return true;
        }else{
            return false;
        }
    }
    
    private int findSumOfDigitsToPower(int n){
        int result = 0;
        double b = findKthDigit(n);
        while(n != 0){
            double a = n % 10;
            result += (int)Math.pow(a, b);
            n = n / 10;
        }
        return result;
    } 
    
    private int findKthDigit(int n){
        int counter = 0;
        while(n != 0) {
        	n /= 10;
        	counter++;
        }
        return counter;
    }
}