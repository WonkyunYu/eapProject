package baekJOON;

import java.util.Scanner;

public class q2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M < 45 && M >= 0) {
			if (H >= 1 && H <= 23) {
			H--;
			M = M + 60 - 45;
			System.out.println(H + " " + M);
			}
			else if(H == 0) {
			H = 23;
			M = M + 60 - 45;
			System.out.println(H + " " + M);
			}
			else {
				System.out.println("H의 값이 이상합니다");
			}
		}
		else if(M >= 45) {
			M = M - 45;
			System.out.println(H + " " + M);
		}else {
			System.out.println("M의 값이 이상합니다");
		}
			
	}
}
