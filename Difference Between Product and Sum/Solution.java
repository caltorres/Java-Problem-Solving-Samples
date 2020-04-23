class Solution {
    public int subtractProductAndSum(int n) {
        int product = findProduct(n);
        int sum = findSum(n);
        int result = product - sum;
        return result;
    }
    
    private int findProduct(int n) {
		int p = 1;
		while(n > 0) {
			p *= n % 10;
			n = n / 10;
		}
		return p;
	}
	
    private int findSum(int n) {
		int s = 0;
		while(n > 0) {
			s += n % 10;
			n = n / 10;
		}
		return s;
	}
	
}
