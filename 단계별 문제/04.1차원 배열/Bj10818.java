package again1;
import java.util.Arrays;
import java.util.Scanner;

public class Bj10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(a);
		System.out.print(a[0]+ " "+a[n-1]);
		
			}
	}
