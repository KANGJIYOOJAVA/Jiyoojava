
public class ex02 {

	public static void main(String[] args) {
		int input = 2;
		
		gugudan(input);
	}
	
	public static void gugudan(int n) {
		
		System.out.println("입력한" + n + "단 출력");
		
		for(int i=1; i<=9; i++)
			System.out.println(n*i);
	}

}
