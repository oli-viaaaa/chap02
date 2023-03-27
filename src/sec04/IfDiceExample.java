package sec04; //package name

public class IfDiceExample {//class start

	public static void main(String[] args) {//main start
		// 0.0 ~ 1.0 사이의 난수 발생
		int num = (int)(Math.random()*6)+1; // 1 ~ 6사이
		// Math.random : 0.0 ~ 1.0 사이의 난수 발생으로 경우의 수 과다로 *6을 통해 1~6사이 랜덤 값 발생 
						//100까지 하고 싶다면 *100으로 설정
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		}else if (num==2) {
			System.out.println("2번이 나왔습니다.");
		}else if (num==3) {
			System.out.println("3번이 나왔습니다.");
		}else if (num==4) {
			System.out.println("4번이 나왔습니다.");
		}else if (num==5) {
			System.out.println("5번이 나왔습니다.");
		}else{
			System.out.println("6번이 나왔습니다.");
		}//else end

	}//main end

}//class end
