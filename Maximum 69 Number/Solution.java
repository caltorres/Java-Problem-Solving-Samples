class Solution {
    public int maximum69Number (int num) {
		if(num == 6) {
			return 9;
		}
		if(num == 9) {
			return 9;
		}
        	int original = num;
		int[] digits = new int[lengthNum(num)];
		int t = 0;
		int i = 0;
		while(num != 0) {
			digits[i] = num % 10;
			num /= 10;
			i++;
		}
		boolean moveOn = false;
		for(int j = 0; j < digits.length; j++) {
			if(digits[j] != 9) {
				moveOn = true;
				break;
			}
		}
		int prevResult = 0;
		if(!moveOn) {
			return original;
		}
		for(int j = 0; j < digits.length; j++) {
			int temp = 0;
			if(digits[j] == 6) {
				temp = digits[j];
				digits[j] = 9;
			}else {
				temp = digits[j];
				digits[j] = 6;
			}
			int index = digits.length - 1;
			int mult = 0;
			int result = 0;
			while(index >= 0 ) {
				mult = (int) Math.pow(10, index);
				result += digits[index] * mult;
				index--;
			}
			digits[j] = temp;
			if(result >= original && result > prevResult) {
				prevResult = result;
			}
		}
		return prevResult;
    }
    
    private int lengthNum(int n) {
		int counter = 0;
		while(n != 0) {
			counter++;
			n /= 10;	
		}
		return counter;
	}
}
