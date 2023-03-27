package sec03; //package name

public class CompareOperator {//class start

	public static void main(String[] args) {//main start
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		System.out.println("result3="+result3);
		
		char char1 = 'A'; // 사람이 입력할땐 문자이지만 반영되는 건 숫자로 반영 
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println("result4="+result4);
		
	

	}//main end

}//class end
