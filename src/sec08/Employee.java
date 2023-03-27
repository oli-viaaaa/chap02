package sec08; //package name

import java.util.PrimitiveIterator.OfDouble;

import sec03.charAt;

public class Employee { // class start

	public static void main(String[] args) { // main start
		// 기초 데이터 만들기(배열 변수)
		String[] name = { "PJH", "JDW", "AJH", "HST", "HTW", "LWS", "LSD", "YJH", "JSW", "LKO" };
		int[] age = { 27, 34, 28, 26, 41, 28, 42, 29, 29, 32 };
		String[] phone = { "010-8532-0537", "010-9672-5257", "010-9932-4536", "010-4117-0975", "011-8975-7892",
				"010-6251-6976", "010-9482-6059", "010-4845-0105", "010-6283-4849", "010-4510-1609" };
		char[] gender = { 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'F', 'M' };
		int[] pay = { 460, 200, 250, 300, 300, 200, 350, 200, 400, 440 };
		String[] country = { "일본", "프랑스", "일본", "미국", "캐나다", "덴마크", "한국", "영국", "미국", "한국" };

		// 1. 사원 정보 출력
		System.out.println("                     <<사원 정보>>                      ");
		System.out.println("=====================================================");
		System.out.println("name    age       phon       gender    pay    country");
		System.out.println("------------------------------------------------------");
		for (int i = 0; i < name.length; i++) {
			System.out.println(
					name[i] + "\t" + age[i] + "\t" + phone[i] + "\t" + gender[i] + "\t" + pay[i] + "\t" + country[i]);
		}
		System.out.println("========================================================");

		// 2. 남자 사원의 평균 연령 구하기
		int sumAge = 0; // 나이 합 변수
		int count = 0; // 사원 수 변수
		double avgAge = 0.0; // 남자 사원 평균 나이.
		char c = 'M'; // 성별 남자

		// 나이와 인원수 함계 계산
		for (int i = 0; i < gender.length; i++) {
			if (gender[i] == c) { // 성별이 남자
				sumAge += age[i]; // 나이 누적
				count = count + 1; // 인원 수 누적
			}
		}
		avgAge = (double) sumAge / count; // 남자 평균 나이 계산
		System.out.printf("2. 남자 사원의 숫자는  %d명 이며 평균 연령은 %.1f세입니다.", count, avgAge);
		System.out.println();

		// 3. 여자 사원의 평균 급여 구하기
		int sumPay = 0;
		count = 0;
		double payAvg = 0.0; // 평균 급여
		c = 'F'; // 성별 여자

		for (int i = 0; i < gender.length; i++) {
			if (gender[i] == c) {// 성별이 여자
				sumPay += pay[i];
				count = count + 1;
			}
		}
		payAvg = (double) sumPay / count;
		System.out.printf("3. 여자 사원의 숫자는 %d명 이며 평균 급여는 %.1f입니다.", count, payAvg);
		System.out.println();

		// 4. 일본에 근무하는 사원들의 이름과 연락처 구하기
		String nameString = ""; // 이름들 변수
		String phoneString = ""; // 연락처들 변수
		
		//String[] arrName = null; // 일본 사원 이름 배열
		//String[] arrphone = null; // 일본 사원 연락처 배열

		// 일본 사원의 이름과 연락처 추출
		for (int i = 0; i < country.length; i++) {
			if (country[i].equals("일본")) {
				nameString = nameString + name[i] + ","; // 이름 연결
				phoneString = phoneString + phone[i] + ","; // 연락처 연결
			}
		}

		// 이름 , 연락처 분리
		String[] arrName = nameString.split(","); // 이름 분리해서 이름 배열에 할당, 구분해서 자르면 배열로 들어감  
		String[] arrphone = phoneString.split(","); // 연락처 분리해서 연락처 배열에 할당

		System.out.println("4. 일본 사원들의 이름과 연락처");
		for (int i = 0; i < arrName.length; i++) {
			System.out.println(arrName[i] + " " + arrphone[i]);
		}

	} // main end

} // class end
