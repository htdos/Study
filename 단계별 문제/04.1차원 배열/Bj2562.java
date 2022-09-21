package again1;
import java.util.Scanner;
public class Bj2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[9];
		int max = 0;
		int count = 0;
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			if(a[i]>max) {
				max = a[i];
				count = i+1;
			}
		}
		System.out.println(max);
		System.out.println(count);
	}

}
