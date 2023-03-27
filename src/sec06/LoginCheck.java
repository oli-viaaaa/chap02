package sec06; //package name

import java.util.Scanner;

public class LoginCheck { // class start

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요.");
		String id = scanner.nextLine();
		
		if(id.equals("java")) {
			System.out.println("비밀번호를 입력하세요.");
			String pw = scanner.nextLine();
			if(pw.equals("1234")) {
				System.out.println("%s님 환영합니다.");
				}else {
					System.out.println("비밀번호가 올바르지 않습니다.");
				}
		}else {
			System.out.println("아이디가 올바르지 않습니다.");
		}
		
	}

} // class end
