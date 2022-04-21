
public class ex01 {

	public static void main(String[] args) {
		// 함수에서 입력(o), 출력(o)
		
		int n = 5;
		int n2 = 10;
		
		System.out.println("main() 함수!!");
		
		int result = sub(n, n2); // 함수호출 --> 인지값
		
		System.out.println("결과 값은" + result);
	}

	
	public static int sub(int n, int n2) {
		
		System.out.println("sub() 함수...");
		
	    return n*n2;
	    
	}
}
