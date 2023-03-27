package sec06;

public class Pyramid {

	public static void main(String[] args) {
		// 10층 직삼각형 피라미드
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < i; j++) { // i보다 커질때까지 반복적으로 * 입력
				System.out.print("*"); // 옆에 이어가기 위해 print 사용
			}
			System.out.println();
		}
	}// main end
}// class end
