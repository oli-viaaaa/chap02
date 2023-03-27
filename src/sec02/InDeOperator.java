package sec02; //package name

/*
 * 산술 연산자, 증감연산자 예제
 */

public class InDeOperator {//class start
	public static void main(String[] args) {//main start
		int x = 10;
		int y = 10;
		int z;
		
		x++; // 증가 후 연산 // x=11
		++x; // 연산 진행 전 증가 // x=12
		System.out.println("x="+x); // x = 12
		
		System.out.println("-------------------------");
		y--;
		--y;
		System.out.println("y="+y); //y = 8
		
		System.out.println("-------------------------");
		z = x++;
		System.out.println("z="+z); // z = 12
		System.out.println("x="+x); // z계산 완료 후 + 진행 // x = 13
		
		System.out.println("-------------------------");
		z = ++x;
		System.out.println("z="+z); // z = 14
		System.out.println("x="+x); // x = 14, y = 8
		
		System.out.println("-------------------------");
		z = ++x + y++;
		System.out.println("z="+z); // z = 23
		System.out.println("x="+x); // x = 15
		System.out.println("y="+y); // y = 9
		
		
		
		
	}//main end

}//class end
