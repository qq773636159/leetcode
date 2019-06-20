package leetcode;

import java.util.*;

public class validParen {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(' || c == '{' || c == '[') {
				stack.add(c);
			}
			else if(c == ')') {
				if(stack.pop() != '(') {
					return false;
				}
			}
			else if(c == '}') {
				if(stack.pop() != '{') {
					return false;
				}
			}
			else if(c == ']') {
				if(stack.pop() != '[') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
