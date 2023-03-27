package sec06;

public class EvenSum2 {

	public static void main(String[] args) {
		// 1~10 짝수의 합
		int sum2 = 0;
		int sum3 = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {// i가 2의 배수일때
				sum2 += i;
			}
			if (i % 3 == 0) {// i가 3의 배수일때
				sum3 += i;
			}
		}
		System.out.println("1~10 2의 배수의 합 :" + sum2);
		System.out.println("1~10 3의 배수의 합 :" + sum3);

	}// main end

}// class end
