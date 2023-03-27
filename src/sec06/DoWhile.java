package sec06;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		}while(! inputString.equals("q")); //String 일때만 .equals// 
		
		System.out.println();
		System.out.println("프로그램 종료");

	}//main end

}//class end
