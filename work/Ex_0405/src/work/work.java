package work;

import java.util.Scanner;

public class work {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		String str = "";
		
		try {
			str = sc.next();
			int num = Integer.parseInt(str);
			System.out.println("결과 : " + num);
		} catch (Exception e) {
			System.out.println("결과 : " + str + "은 정수가 아닙니다.");
		}
	}
}
