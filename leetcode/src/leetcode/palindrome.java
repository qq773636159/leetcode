package leetcode;
import java.util.*;

public class palindrome {
	 public static boolean isPalindrome(int x) {
		 if(x < 0) return false;
		 
		 String s = Integer.toString(x);
		 Queue<Character> q = new LinkedList<Character>();
		 for(int i = 0; i < s.length()/2; i++) {
			 q.add(s.charAt(i));
		 }
		 for(int i = s.length() -1; i >=s.length()/2 + s.length()%2; i--) {
			 if(q.poll() != s.charAt(i)) return false;
		 }
		 return true;
	 }
	 public static void main(String[] args) {
		 System.out.print(isPalindrome(55));
	 }
}
