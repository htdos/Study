package again1;
import java.util.Scanner;
public class Bj1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // ���� ��
		double a[] = new double[n]; //���� �� ũ��� �迭 ����
		double max = 0; 
		double avg = 0;
		
		for(int i=0; i<a.length; i++) { //�ִ� ���ϱ�
			a[i] = sc.nextDouble();
			if(a[i]>max) {
				max = a[i];
			}
		}	
		
		for(int j=0; j<a.length; j++) { //���� �����ϱ�
			a[j] = (a[j]/max)*100;
			avg += a[j];
		}
		System.out.print(avg= avg/a.length);
	}
}


