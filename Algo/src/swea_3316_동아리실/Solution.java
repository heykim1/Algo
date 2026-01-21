package swea_3316_동아리실;


import java.io.File;
import java.util.Scanner;

public class Solution {
	static char[] arr;
	public static void main(String[] args) throws Exception {
//		File file = new File("./src/swea_3316_동아리실/input_3316.txt");
//		Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		
		int TC = sc.nextInt();
		for(int t=1; t<= TC; t++) {
			String str = sc.next();
			arr = str.toCharArray();
			for(int i=0; i<arr.length; i++) {
				method()
			}
		}
	}
	static void method(String str) {
	}
}
