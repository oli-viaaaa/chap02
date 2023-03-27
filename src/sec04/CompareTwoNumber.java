package sec04;

import java.util.Scanner;

public class CompareTwoNumber {

	public static void main(String[] args) {
		// 키보드에서 두 숫자를 받아서 값을 비교하시오
		// int a = scanner.nextint(); 활용
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하시오.");
		int a = scanner.nextInt(); //첫번째 숫자
		
		System.out.println("두번째 숫자를 입력하시오.");
		int b = scanner.nextInt(); // 두번째 숫자
		
		if(a>b) {
			System.out.println("첫번째 숫자가 더 큽니다.");
		}else if(a<b) {
			System.out.println("두번째 숫자가 더 큽니다.");
		}else {
			System.out.println("두 수가 같습니다");
		}
		// 자원닫기
		scanner.close();
		
		

	}

}
