package swea_1230_암호문;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	static List<Integer> list;
	public static void main(String[] args) throws Exception {
//		File file = new File("./src/swea_/input_.txt");
//		Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		
		int TC = 10;
		for(int t=1; t<= TC; t++) {
			//암호문 받기
			int N = sc.nextInt();
			list = new ArrayList<Integer>();
			for(int n=1; n<= N; n++) {
				list.add(n, sc.nextInt());
			}
			//명령어 받기
			int M = sc.nextInt();
			for(int m = 0; m<M; m++) {
				String s = sc.next();
				if(s.equals("I")) {
					s.
				} else if(s.equals("D")) {
					
				} else if(s.equals("A")) {
					
				}
			}
		}
		
	}
}
