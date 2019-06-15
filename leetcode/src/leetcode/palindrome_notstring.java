package leetcode;
import java.util.*;

public class palindrome_notstring {
	public static boolean isPalindrome(int x) {
		int rev = 0, y = x;
		while(y > 0) { //negative value checked here
			rev = rev * 10 + y % 10;
			y /= 10;
		}
		return x == y;
	}
	
	public static void main(String[] args) {
		System.out.print(isPalindrome(32));
	}
}
