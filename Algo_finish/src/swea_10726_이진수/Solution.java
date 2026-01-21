package swea_10726_이진수;


import java.io.File;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {
		File file = new File("./src/swea_10726_이진수/input_10726.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		int TC = sc.nextInt();
		for(int t =1; t<= TC; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			System.out.printf("#%d %s%n",t,method(N,M));
			
		}//TC-for
	}//main
	
	static String method(int N, int M) {
		return (M+1)%(1<<N) == 0 ? "ON" : "OFF"; 
	}//method
}
