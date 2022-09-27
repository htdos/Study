package again1;

import java.util.Scanner;

public class Bj3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		boolean bl;
		int count = 0;
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt() % 42;
		}
		
		for(int i=0; i<a.length; i++) {
			bl = false;
			for(int j=i+1; j<a.length; j++) {
				if(a[i] == a[j]) {
					bl = true;
					break;
				}
			}
			if(bl == false) {
				count ++;
			}
		} System.out.println(count);

	}
}
