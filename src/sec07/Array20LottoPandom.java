package sec07; //package name

import java.util.Scanner;

public class Array20LottoPandom { // class start

	public static void main(String[] args) { // main start
		// 배열 선언(6개 공간 담는 배열 선언(공간확보))
		int[] numArr = new int[6];

		// 세트 입력(Scanner - 2byte)
		Scanner scan = new Scanner(System.in); // System.in 1byte
		System.out.println("몇 세트의 난수를 발생시키겠습니까?");
		int set = scan.nextInt();

		// while
		while (set > 0) {
			// 난수 발생 for
			for (int i = 0; i < numArr.length; i++) { // 인덱스 위치
				// 난수 1~45
				numArr[i] = (int) (Math.random() * 45) + 1;
				for (int j = 0; j < i; j++) {
					if (numArr[j] == numArr[i]) {// 중복 방지
						i = i - 1; // i++ 인덱스의 빈칸을 유지하기 위해
						break;
					} // if
				} // for2
			} // for1

			// 힌 세트 출력(향상된 for문)
			for (int i : numArr) {
				System.out.print(i + "\t");
			} // for3
			System.out.println();
			set = set - 1; // 1씩 차감(set--)

		} // while

	}// main end

}// class end
