package sec03; //package name

public class AssignmentOperator { //class start

	public static void main(String[] args) { //main start
		int result = 0;
		result += 10; // result = 10
		// result = result + 10;
		System.out.println("result="+result);
		result -= 5; // result = 5
		// result = result - 5;
		System.out.println("result="+result);
		result *= 3; // result = 15
		// result = result * 3;
		System.out.println("result="+result);
		result /= 5; // result = 3
		// result = result / 3;
		System.out.println("result="+result);
		result %= 3; // result = 0
		System.out.println("result="+result);

	} //main end

} //class end
