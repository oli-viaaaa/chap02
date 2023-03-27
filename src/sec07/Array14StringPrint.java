package sec07;

public class Array14StringPrint {

	public static void main(String[] args) {
		// "000 님이 상담을 받았습니다."로 출력 하기
		String[] members = {"최진형","이성준","최기선"};
		
		// 일반 for문
		for (int i = 0; i < members.length; i++) {
			System.out.printf("%s 님이 상담을 받았습니다.\n",members[i]);
		}
		System.out.println();
		
		// 향상된 for문
		for(String string : members) {
			System.out.printf("%s 님이 상담을 받았습니다.\n",string);
		}
	} //main end

} //class end
