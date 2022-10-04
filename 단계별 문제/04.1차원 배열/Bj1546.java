package again1;
import java.util.Scanner;
public class Bj1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 과목 수
		double a[] = new double[n]; //과목 수 크기로 배열 생성
		double max = 0; 
		double avg = 0;
		
		for(int i=0; i<a.length; i++) { //최댓값 구하기
			a[i] = sc.nextDouble();
			if(a[i]>max) {
				max = a[i];
			}
		}	
		
		for(int j=0; j<a.length; j++) { //점수 조작하기
			a[j] = (a[j]/max)*100;
			avg += a[j];
		}
		System.out.print(avg= avg/a.length);
	}
}


