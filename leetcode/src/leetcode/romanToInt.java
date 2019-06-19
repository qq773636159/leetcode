package leetcode;

public class romanToInt {
	public static int romanToInt(String s) {
		char[] arr = s.toCharArray();
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 'I') {
				if( i< arr.length-1 && (arr[i+1] == 'X' || arr[i+1] == 'V')) {
					sum -= 1;
				}
				else {
					sum += 1;
				}
			}
			else if(arr[i] == 'V') {
				sum += 5;
			}
			else if(arr[i] == 'X') {
				if(i<arr.length -1 && (arr[i+1] == 'C' || arr[i+1] == 'L')) {
					sum -= 10;
				}
				else {
					sum += 10;
				}
			}
			else if(arr[i] == 'L') {
				sum += 50;
			}
			else if(arr[i] == 'C') {
				if(i<arr.length -1 && (arr[i+1] == 'D' || arr[i+1] == 'M')) {
					sum -= 100;
				}
				else {
					sum += 100;
				}
			}
			else if(arr[i] == 'D') {
				sum += 500;
			}
			else if(arr[i] == 'M') {
				sum += 1000;
			}	
			else {
				throw new IllegalArgumentException("not a roman numeral");
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.print((int) 'A');
	}
}
