package leetcode;

import javax.xml.transform.stax.StAXResult;

public class longestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length == 0) return "";
        String s = "";
		boolean inAll = true;
		int index = 0;
		int len = strs[0].length();
		while_loop:
		while(index <= len) {
			s = strs[0].substring(0, index);
			for(int i = 0; i < strs.length; i++) {
				if(!strs[i].startsWith(s)) {
					inAll = false;
                    break while_loop;
				}
			}
			index++;
		}
		
		return inAll ? s : strs[0].substring(0, index-1);
	}
	
	public static void main(String[] args) {
		String[] str = {"dog","racecar","car"};
		System.out.print(longestCommonPrefix(str));
	}
}
