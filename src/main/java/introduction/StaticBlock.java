package introduction;

import java.util.*;

public class StaticBlock {

	private static boolean flag = true;
	private static int B;
	private static int H;
	
	static {
		Scanner in = new Scanner(System.in);
		B = in.nextInt();  
		H = in.nextInt(); 
		if(B <= 0 || H <=0){
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		in.close();
	}
	
	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}

}
