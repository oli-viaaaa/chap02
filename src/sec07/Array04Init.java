package sec07;

public class Array04Init { // class start

	public static void main(String[] args) { // main start
		// 각 type(자료형) 별로 배열 선언
		int[] intArr = new int[3]; // 000 입력
		double[] dblArr = new double[3]; // 0.0
		float[] floatArr = new float[3]; // 0.0
		boolean[] boolArr = new boolean[3]; // false
		String[] strArr = new String[3]; // null
		
		// 자동으로 초기화된 값 확인하기
		System.out.println("int[1] : "+intArr[1]);
		System.out.println("double[1] : "+dblArr[1]);
		System.out.println("float[1] :"+floatArr[1]);
		System.out.println("boolean[1] : "+boolArr[1]);
		System.out.println("String[1] : "+strArr[1]);

	} // main end

} // class end
