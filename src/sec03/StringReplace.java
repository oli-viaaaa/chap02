package sec03; // package name

/*
 * replace 메소드 예제
 * 자주 사용됨
 */

public class StringReplace { //class start

	public static void main(String[] args) { //main start
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바","JAVA"); // 첫번째거는 바꿀 문자 , 두번째는 바뀔 문자
		
		System.out.println(oldStr);
		System.out.println(newStr);

	}//main end
} //class end
