package leetcode;

//tried the getBytes. Realize that the time and space performance is not better.
//time complexity is O(n)? space complexity is O(n)?
public class reverseInteger {
	public static int reverse(int x) {
        String num = Integer.toString(x);
        char[] ch = num.toCharArray();
        int len = ch.length;
        char[] result = new char[len];
        if(x >= 0) {
        	for(int i=0; i<len; i++) {
            	result[i] = ch[len-1-i];
            }
        }
        else {
        	for(int i = 1; i<len;i++) {
        		result[i] = ch[len-i];
        	}
        	result[0] = '-';
        }
        
        String num_rev = new String(result);
        if(Long.parseLong(num_rev)>Integer.MAX_VALUE || Long.parseLong(num_rev)<Integer.MIN_VALUE) {
        	return 0;
        }
        else {
        	return (int)Long.parseLong(num_rev);
        }
    }
	
	public static void main(String[] args) {
		System.out.print(5/2);
	}
}
