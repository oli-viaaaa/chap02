package sec07;

/*
 * 세 과목의 총점과 평균 구하기
 */

public class Array01Old {//class start
	public static void main(String[] args) {//main start
		
		int a = 80;
		int b = 75;
		int c = 90;
		
		int sum = 0;
		sum = a + b +c;
		// 정수간 나눗셈은 몫이 정수(소수점 버림) 예방 차원에서 3-> 3.0으로 double 형변환
		
		double average = sum/3.0;
		//double average = (double)sum/3;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//총점
		System.out.println("세 과목의 총점 : "+sum);
		
		//평균(81.66666666666667)
		System.out.println("1. 세 과목의 평균 점수 : " + average);
		System.out.printf("2. 세 과목의 평균 점수 : %.2f\n",average);
		System.out.printf("3. 세 과목의 평균 점수 : "+Math.round(average*100)/100.0);
		/*
		 * 81.66666666666667*100
		 * Math.round(8166.666666666667)
		 * 8167/100.00
		 * 81.67
		 */
		System.out.println();
		System.out.println(String.format("4. 세 과목의 평균 점수 : %.2f",average));
		
		

	}//main end

}//class end
