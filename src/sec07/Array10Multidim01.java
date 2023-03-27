package sec07;

public class Array10Multidim01 {

	public static void main(String[] args) {
		// 각 반의 학생 수가 3명으로 동일한 경우 점수 저장을 위한 2차원 배열 생성
		int[][] mathScores = new int[2][3]; // 배열항목 초기값 출력

		// 배열 항목 값 변경
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;

		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;

		// 전체 학생의 수학 평균 구하기
		int totalStudent = 0;
		int totalMathSum = 0;
		for (int i = 0; i < mathScores.length; i++) { // 반의 수만큼 반복
			totalStudent += mathScores[i].length; // 반의 학생 수 합산
			for (int k = 0; k < mathScores[i].length; k++) { // 해당 반의 학생 수만큼 반복
				totalMathSum += mathScores[i][k]; // 학생 점수 합산
			} // for end
		} // for end
		double totalMathAvg = (double) totalMathSum / totalStudent;
		System.out.println("전체 학생의 수학 평균 점수 :" + totalMathAvg);
		System.out.println();

		for (int i = 0; i < mathScores.length; i++) { // 반의 수만큼 반복
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.print(mathScores[i][j] + "");
			} // for end
			System.out.println();
		} // for end

		// 90점 이상 카운트 하기
		int count = 0; // 카운터 변수
		for (int i = 0; i < mathScores.length; i++) { // 반의 수만큼 반복
			for (int j = 0; j < mathScores[i].length; j++) {
				if (mathScores[i][j] >= 90) {
					count = count + 1;
					System.out.println(count);
				}

			}
		}
		System.out.println("count : " + count);

	}// main end

}// class end
