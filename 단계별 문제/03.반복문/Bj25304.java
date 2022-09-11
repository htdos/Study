package again1;
import java.util.Scanner;
public class Bj25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, n;
		x = sc.nextInt();
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			x = x - (a*b);
		}
		if(x == 0){
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
		}
	}

