package baekJOON;

import java.util.Scanner;

public class q9086re {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		String dan[]  = new String[num];
		
		for(int i = 0; i<num; i++) {
			String str = in.next();
			dan[i] = str.substring(0,1) + str.substring(str.length()-1,str.length());
		}
		
		for(int i = 0; i<num; i++) {
			System.out.println(dan[i]);
		}
		
	}
}
