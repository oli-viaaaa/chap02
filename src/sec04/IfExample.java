package sec04; //package name

public class IfExample {//class start

	public static void main(String[] args) {//main start
		int score = 93;
		
		if(score >= 90) {//if_1 start
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}//if_1 end
		
		if(score < 90) {//if_2 start
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}//if_2 end
		

	}//main end
}// class end
