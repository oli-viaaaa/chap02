package sec08;

import sec03.charAt;

public class String01Handling {
	public static void main(String[] args) {

		String jumin = "901030-2383763";

		// [1] charAt() 함수
		// 문자열을 반복문을 통해서 한자씩 추출
		for (int i = 0; i < jumin.length(); i++) {
			System.out.print(jumin.charAt(i));
		}
		System.out.println();

		// [2] substring() 함수로 주민번호 앞뒤를 각각 출력
		/*
		 * String firstnum = jumin.substring(0,6); String secondnum =
		 * jumin.substring(7); System.out.println(firstnum);
		 * System.out.println(secondnum);
		 */

		System.out.println(jumin.substring(0, 6));
		System.out.println(jumin.substring(7));

		// [3] 주민번호로 남성입니다. 여성입니다. 구분해서 출력
		String gender = jumin.substring(7, 8);
		if (gender.equals("1")) {
			System.out.println("남성입니다");
		} else {
			System.out.println("여성입니다	");
		}

		// [4] split(함수)
		// [4-1] 주민번호를 '-'기준으로 split 여성/남성 입니다. 구분해서 출력
		String[] sp = jumin.split("-"); // '-'기준으로 분리
		System.out.println(sp[0] + " " + sp[1]); // '-'기준으로 구분하여 앞자리와 뒷자리로 분리
		gender = sp[1].substring(0, 1);
		if (gender.equals("1")) {
			System.out.println("남성입니다.");
		} else {
			System.out.println("여성입니다.");
		}

		// [4-2] 문자열을 ';'기준으로 split -> tab키로 분리 출력
		String str1 = "홍길동;천안;28;도술;010-2345-6789";
		String[] str2 = str1.split(";");
		// System.out.println(str2[0]);
		// System.out.println(str2[1]);
		// System.out.println(str2[2]);
		// System.out.println(str2[3]);
		// System.out.println(str2[4]);

		for (String st : str2) {
			System.out.print(st + "\t");
		}

		// [4-3] 전화번호 문자열 자르기 split()
		String strnum = "010-1234-5678";
		String[] struum2 = strnum.split("-");
		System.out.println();
		System.out.println(struum2[0] + struum2[1] + struum2[2]);
		/*
		 * for (String num : struum2) { System.out.print(num); }
		 */

		// [4-4] replace
		System.out.println();
		System.out.println("replace : " + strnum.replace("-", ""));

		// [5] indexOf("구분자") 구분자의 위치 반환, 주민등록번호 뒷자리
		System.out.println(jumin.indexOf("-")); // 6
		System.out.println(jumin.substring(jumin.indexOf("-") + 1));

	} // main end

} // class end
