package soyeon;

import java.util.Scanner;

public class lsy20211700_mid1 {
	public static void main(String[] args) {
		
		int com = 0 , user = 0;
		int com_m = 100; //���ӸӴϼ���
		int user_m = 100; //���ӸӴ� ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� ���� �� �����Դϴ�.");
		System.out.println("-----------------------");
		System.out.println("��ȣ�� �Է����ּ���.");
		System.out.println("����:1 ����:2 ��:3 ���� ����:4");
		System.out.println("-----------------------");
		System.out.println("�÷��̾��� ���ӸӴϴ� 100�Դϴ�.");
		System.out.println("��ǻ���� ���ӸӴϴ� 100�Դϴ�.");
		
		while(true) {
			com = (int)(Math.random() * 3) + 1;
			user = scanner.nextInt();
			
			int num = com - user;
		if(num == -2 || num == 1) {
			System.out.println("���� �й�");
			user_m -= 50;
			com_m += 50;
			System.out.println("�÷��̾�� ���ӸӴ� 50�� �Ҿ����ϴ�!");
			System.out.println("�÷��̾��� �����ݾ�: " + user_m +"��");
			System.out.println("��ǻ�Ͱ� �����ݾ�: " + com_m +"��");
		} else if(num == -1 || num == 2) {
			System.out.println("���� �¸�");
			user_m += 50;
			com_m -= 50;
			System.out.println("�÷��̾�� ���ӸӴ� 50�� ������ϴ�!");
			System.out.println("�÷��̾��� �����ݾ�: " + user_m +"��");
			System.out.println("��ǻ�Ͱ� �����ݾ�: " + com_m +"��");
		} else if(num == 0) {
			System.out.println("���º��Դϴ�.");
		} else if(user == 4) {
			System.out.println("������ ����˴ϴ�.");
			break;
		} else if(user > 4 || user < 1) {
			System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���.");
		}
		
		if (user_m == 200 || com_m == 0) {
			System.out.println("�÷��̾ �¸��߽��ϴ�!");
		break; } 
		else if (user_m == 0 || com_m == 200){
			System.out.println("�÷��̾ �й��߽��ϴ�!");
			break;} 
		
			
		}

	}

}