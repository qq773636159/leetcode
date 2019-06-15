package leetcode;

public class reverseInteger_pop {
	// time complexity is O(logx) cause there are around logn digit in x. 
	public int reverse(int x) {
		int rev = 0; 
        while(x!=0){
            //pop will return negative if x < 0
            int pop = x % 10;
            x = x / 10;
            //check if overflow. compare rev with MAX/10 and MIN/10
            if( rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE && pop >7)  ){
                return 0;
            }
            if( rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE && pop < -8) ){
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
