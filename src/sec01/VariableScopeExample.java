package sec01; //package name

/*
 * 변수의 사용 범위(scope)
 */

public class VariableScopeExample {//class start
	public static void main(String[] args) {//main start
		int v1 = 15;
		int v2 = 0;
		if(v1>10) {
			v2 = v1 - 10; // int를 if 안에 선언한다면 밖에서 사용 불가 
		}//if end
		int v3  = v1 + v2 +5; //v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생

	}//main end

}//class end
