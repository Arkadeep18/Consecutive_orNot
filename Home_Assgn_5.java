import java.util.*;
public class Home_Assgn_5 {

	public static boolean consecutive_num(int x, int y, int z) {
		return((y==x+1 && z==y+1)||(x==y+1 && y==z+1)) ;
			
		
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter x");
		 int x = sc.nextInt();
		 System.out.println("Enter y");
		 int y = sc.nextInt();
		 System.out.println("Enter z");
		 int z = sc.nextInt();
		 
		 System.out.println("The numbers are consecutive number: "+consecutive_num(x, y, z));
	}

}
