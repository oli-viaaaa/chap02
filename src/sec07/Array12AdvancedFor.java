package sec07;

// 향상된 for문

public class Array12AdvancedFor {//class start
	public static void main(String[] args) { //main start
		// 배열 변수 선언과 배열 생성
		int[] scores = {95, 71, 84, 93, 87};
		// 배열 항목 전체 합 구하기
		int sum = 0;
		for(int score : scores) { //AdvancedFor문 = 향상된 for문
			sum += score;
			//sum = sum + score;
		}
		System.out.println("점수 총합 =" +sum);
		// 배열 항목 전체 평균 구하기
		double avg = (double)sum/scores.length; // 소수점 구하기 위해 형변환
		System.out.println("점수 평균 =" + avg);
		
	}//main end

}//class end
