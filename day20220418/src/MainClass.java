import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws IOException {
		
		int count=0;
		File file = new File("data/data1.txt");
		
		FileInputStream src = new FileInputStream(file);
		
		Scanner sc = new Scanner(src);
		
		while(sc.hasNext()) {
			String tmp = sc.nextLine();
			System.out.printf("%s " , tmp );
			count++;
		
		}	
		System.out.println("count : " + count);
		
//		sc.close();
//		src.close();

		int[] nums = new int[count];
		{
		
		}
	}

}
