package sec03; //package name

public class charAt { //class start

	public static void main(String[] args) { //main start
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);
		switch (sex) { //switch문 else if와 비슷
			case'1' :
			case'3' :
				System.out.println("남자입니다.");
				break;
			case'2' :
			case'4' :
				System.out.println("여자입니다.");
				break;
		}//switch end
		

	}//main end

}//class end
