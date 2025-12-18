package baekJOON;

import java.util.Scanner;

public class q9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a > 100 || a < 0) {
			System.out.println("범위 오류(0 <= a <= 100");
		}else if(a >= 90) {
			System.out.println("A");
		} else if(a >= 80) {
			System.out.println("B");
		} else if(a >= 70) {
			System.out.println("C");
		} else if(a >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		
		
	}
}
