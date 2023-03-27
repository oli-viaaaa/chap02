package sec07;

public class Array07RefObject { //class start
	public static void main(String[] args) { //main end
		
		String[] strArray = new String[3];
		strArray[0] = "JAVA";
		strArray[1] = "JAVA";
		strArray[2] = new String("JAVA");
		
		System.out.println(strArray[0] == strArray[1]);      // true // == 번지수 비교
		System.out.println(strArray[0] == strArray[2]);      // false
		System.out.println(strArray[0].equals(strArray[2])); // true // equals = 값 비교

	} //main end

} //class end
