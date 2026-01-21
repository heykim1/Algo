package swea_1288_불면증;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	static int[] arr;
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/swea_1288_불면증/input_1288.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		int TC = sc.nextInt();
		for(int tc=1; tc<=TC; tc++) {
			int M = 0;
			int N = sc.nextInt();
			arr = new int[10];
			boolean result = false;
			while(!result) {				
				M += N;
				result = method(M);
			}
			System.out.printf("#%d %d%n",tc, M);	
		}//TC-for
	}//main
	
	static boolean method(int M) {
		while(M!=0) {
			arr[M%10] = 1;
			M /= 10;
		}
		int cnt = 0;
		for(int i : arr) {
			if(i != 1) return false;
		}
		return true;
		
	}
}
