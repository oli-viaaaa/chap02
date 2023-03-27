package sec06;

public class While1To10Sum {

	public static void main(String[] args) {
		// 1~10 짝수의 합
		int sum = 0;
		int i = 1;

		/*while (i <= 10) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1~" + (i - 1) + "합 :" + sum);
		*/
		
		while (true) {
			if (i % 2 == 0) {
				sum += i;
			}
			if (i > 10) {
				break;
			}
			i++;

		}
		System.out.println("sum : " + sum);

	}// main end

} // class end
