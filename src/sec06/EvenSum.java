package sec06;

public class EvenSum {

	public static void main(String[] args) {
		// 1~10 짝수의 합
		int sum = 0;
		
		for(int i =1; i<=10; i++) {
			if(i%2 ==0) {// i가 2의 배수일때(짝수)
				sum+=i;
			}
		}
		System.out.println("1~10 짝수의 합 :" +sum);
		
		

	}// main end

}//class end
