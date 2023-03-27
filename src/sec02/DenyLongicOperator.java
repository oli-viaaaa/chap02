package sec02; //package name

public class DenyLongicOperator { //class start
	public static void main(String[] args) { //main start
		boolean play = true;
		System.out.println(play);
		
		play = !play; // !로 인해 play값이 false로 변경
		System.out.println(play);
		
		play = !play; // !로 인해 play값이 true로 변경
		System.out.println(play);

	}//main end

}//class end
