package sec03; //package name

public class LengthExample {//class start

	public static void main(String[] args) {//main start
		String ssn = "9506241230123";
		int length = ssn.length(); //length 문자열의 크기 확인 가능
		if(length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		}//if end
		else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}//else end

	}//main end

}//class end
