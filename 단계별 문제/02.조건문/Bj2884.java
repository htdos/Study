package again1;
import java.util.Scanner;

public class Bj2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h,m;
		h = sc.nextInt();
		m = sc.nextInt();
		
		if(m < 45) {
			h--;		// 시(hour) 1 감소
			m= 60 - (45 - m); 	// 분(min) 감소
			if(h < 0) {
				h = 23;
			} System.out.println(h + " " + m);
			} else {
			System.out.println(h + " " + (m - 45));
			}
		}
	}
