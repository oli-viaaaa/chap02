package sec07; //package name

/*
 * [모듈화]
 * 	- 평균 구하는 로직을 메소드로 분리함
 */

public class Array03param { //class start

	public static void main(String[] args) { //main start
		int[] intarr = { 80, 75, 90 };

		// 평균을 구해주는 메소는 호출
		double avg = getSum(intarr); // 인자(argument)로 배열을 전달 //getSum 모듈

		System.out.printf("average : %.2f", avg);
	} // main end

	// 평균을 구해주는 메소드(double : 반환타입)
	public static double getSum(int[] arr) {// 매개변수가 배열 타입
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			System.out.println(arr[i]);
		} //for end

		double avg = (double) sum / arr.length;
		return avg; // 값을 반환

	} //getSum end

} //class end
