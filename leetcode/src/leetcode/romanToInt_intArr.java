package leetcode;

public class romanToInt_intArr {
	public static int romanToInt(String s) {
		int sum = 0;
		int[] arr = new int[90]; //cause 'Z' ascii is 90;
		arr['I'] = 1; arr['V'] = 5; arr['X'] = 10; arr['L'] = 50;
		arr['C'] = 100; arr['D'] = 500; arr['M'] = 1000;
		
		for(int i = 0; i < s.length(); i++) {
			int curr = arr[s.charAt(i)];
			if(i<s.length()-1 && (arr[s.charAt(i+1)] > curr)) {
				sum -= curr;
			}
			else {
				sum += curr;
			}
		}
			
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.print(romanToInt("MCMXCIV"));
	}
}
