
public class ex01 {

	public static void main(String[] args) {
		// �Լ����� �Է�(o), ���(o)
		
		int n = 5;
		int n2 = 10;
		
		System.out.println("main() �Լ�!!");
		
		int result = sub(n, n2); // �Լ�ȣ�� --> ������
		
		System.out.println("��� ����" + result);
	}

	
	public static int sub(int n, int n2) {
		
		System.out.println("sub() �Լ�...");
		
	    return n*n2;
	    
	}
}
