package sec03;

public class SubStringExam {//class start

	public static void main(String[] args) { //main start
		String ssn = "880815-1234567";
				
		String firstNum = ssn.substring(0, 6); // 0 인덱스 포함해서 6번째 인덱스까지 ( 6번째 '-' 미포함)
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); // 7번째 인덱스 포함해서 마지막까지
		System.out.println(secondNum);

	}//main end

}//class end
