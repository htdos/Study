package again1;
import java.util.Scanner;

public class Bj2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(b+c>=60) {
			a = ((b+c)/60) + a;
			b = b+c;
			b = b%60;
		if(a>=24) {
			a = a - 24;
		}System.out.print(a+" "+b);
		} else {
			b = b+c;
		System.out.print(a+" "+b);
		}
	}
}

		
		

