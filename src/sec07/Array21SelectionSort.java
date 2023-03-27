package sec07; //package name

public class Array21SelectionSort { // class start

	public static void main(String[] args) { // main start
		/*
		 * [선택정렬] 내림차순 정렬
		 */
		int[] age = null;
		int small = 0;
		age = new int[] { 1, 3, 2, 5, 4 };

		for (int i = 0; i < age.length - 1; i++) { // 자리수 지정, -1 : 전체 다 돌아도 괜찮지만 4개만 돌아도 마지막 하나 정렬완료됨
			for (int j = i + 1; j < age.length; j++) { // j 증가 순환 이후 i증가
				if (age[i] < age[j]) {
					small = age[i]; // small 임시저장(삭제 방지)
					age[i] = age[j];
					age[j] = small;
				} // if end
			} // for2 end
		} // for1 end

		for (int i : age) {
			System.out.println(i + "\t");
		} // for3 end

	} // main end

} // class end
