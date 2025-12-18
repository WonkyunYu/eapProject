package baekJOON;

import java.util.Scanner;

public class q11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String ch = sc.next();
		sc.close();
		
		int sum = 0;
		
		for(int i=0; i<num; i++) {
			sum += ch.charAt(i)-'0';
		}
		
		System.out.println(sum);
		
	}

}
