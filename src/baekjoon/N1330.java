package baekjoon;
import java.util.*; 

public class N1330 {	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int A = scan.nextInt(); 
    int B = scan.nextInt(); 
	
    scan.close();
    
	if(A>B) 
		System.out.print(">"); 
	else if(A<B)
		System.out.println("<");
	else if(A==B)
	System.out.println("==");
	
	}
}
