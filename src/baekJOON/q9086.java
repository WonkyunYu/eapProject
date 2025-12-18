package baekJOON;

import java.util.Scanner;

public class q9086 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		
		String name[] = new String[n];
		
		for(int i=0;i<n;i++) {
			String str = sc.next();
			if(str.length() == 0) {
				System.out.println("값 오류");
			}else {
			name[i] = str.substring(0,1)+ str.substring(str.length()-1,str.length());
		}
		}
		
		sc.close();
		
		for(int i=0;i<n;i++) {
			System.out.println(name[i]);
		}
		
	}
}
