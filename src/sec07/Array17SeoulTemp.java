package sec07;

public class Array17SeoulTemp { // class start

	public static void main(String[] args) { //main start
		float[] monTemp = new float[] {-2.5f, -0.2f, 5.2f, 12.1f, 17.4f, 21.9f, 24.9f, 29.4f, 27.8f, 14.4f, 6.9f, 0.2f};
		
		float sum = 0.0f;
		double avg = 0.0;
		
		for(int i= 0; i<monTemp.length; i++) {
			sum = sum+monTemp[i];
		} //for end
		
		avg = sum/monTemp.length;
		System.out.printf("연평균 기온 : %.2ff",avg);
		

		// 가장 더운 달 
		float max = 0.0f;
		for(int i= 0; i<monTemp.length; i++) {
			if(monTemp[i]>max)
				max = monTemp[i];
		}
		System.out.println("가장 높은 기온은 :" + max + "입니다");
	} //main end

} //class end
