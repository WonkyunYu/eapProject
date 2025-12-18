package baekJOON;

import java.util.Scanner;

public class q2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		String S = sc.next();
		sc.close();
		
		int[] ll = new int[S.length()];
		
		for (int i =0; i < S.length(); i++) {
			char c = S.charAt(i);
			int index = (c - 'a') * R;
		}
		
		for(int i = 0; i<S.length(); i++) {
			System.out.println(ll[i]+ " " );
		}
		
	}

}
