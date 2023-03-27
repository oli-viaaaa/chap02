package sec06;

/**
 * 1부터 100까지 합 구하기
 */


public class For1To100Sum { //class start

	public static void main(String[] args) { // main start
		/*
		 * int sum = 0;
		for (int i = 1; i <=100; i++) {
			sum += i;
		}//for end
		System.out.println("1~100 합 :" +sum);
		*/
		 int sum = 0;
	      int i;
	         
	      for(i=1; i<=100; i++) {
	         sum += i;
	      }
	      System.out.println("1~" + (i-1) + " 합 : " + sum);
	} // main end

} // class end
