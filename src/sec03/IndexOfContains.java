package sec03;

public class IndexOfContains {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); // subject에 지정된 내용 중 프로그래밍이 몇번째 자리에 위치해있는가
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요.");
		}//if end
		else {
			System.out.println("자바와 관련 없는 책이군요.");
		}//else end
		
		boolean result = subject.contains("자바"); // contains 문장 안에 포함되어 있는가
		if(result) {
			System.out.println("자바와 관련된 책이군요.");
		}//if end
		else {
			System.out.println("자바와 관련 없는 책이군요.");
		}//else end

	}//main end

}//class end
