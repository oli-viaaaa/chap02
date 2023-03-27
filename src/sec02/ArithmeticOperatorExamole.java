package sec02; //package name

/*
 * %연산자 : 나눗셈의 몫을 구하는 연산자
 */

public class ArithmeticOperatorExamole {//class start
	public static void main(String[] args) {//main start
		byte v1 = 10;
		byte v2 = 4;
		
		int result4 = v1 % v2;
		System.out.println("% 연산 결과 : "+result4);
		
		int a = 10;
		if(a % 2 == 0) {//if start //배수 관련 문제 암기 할 것
			System.out.println("2의 배수입니다.");
		}//if end
		

	}//main end

}//class end
