package soyeon;

import java.util.Scanner;

public class lsy20211700_mid2 {
	public static void main(String[] args) {
		
		int com_m = 100; //���ӸӴ� ����
		int user_m = 100; //���ӸӴ� ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� ���� �� �����Դϴ�.");
		System.out.println("-----------------------");
		System.out.println("���ڸ� ������ �Է����ּ���.");
		System.out.println("����, ����, ��");
		System.out.println("-----------------------");
		System.out.println("�÷��̾��� ���ӸӴϴ� 100�Դϴ�.");
		System.out.println("��ǻ���� ���ӸӴϴ� 100�Դϴ�.");
		
		while(true) {
			int com = (int)(Math.random() * 3)+1;
			String user = scanner.nextLine();			
			
			switch (com) {
				case 1:
					if(user.equals("����")) {
						System.out.println("���º�");
						break;
					}
					if(user.equals("����")) {
						System.out.println("���� �¸�");
						user_m += 50;
						com_m -= 50;
						System.out.println("�÷��̾�� ���ӸӴ� 50�� ������ϴ�!");
						System.out.println("�÷��̾��� �����ݾ�: " + user_m +"��");
						System.out.println("��ǻ�Ͱ� �����ݾ�: " + com_m +"��");
						break;
						}
					if(user.equals("��")) {
						System.out.println("���� �й�");
						user_m -= 50;
						com_m += 50;
						System.out.println("�÷��̾�� ���ӸӴ� 50�� �Ҿ����ϴ�!");
						System.out.println("�÷��̾��� �����ݾ�: " + user_m +"��");
						System.out.println("��ǻ�Ͱ� �����ݾ�: " + com_m +"��");
						break;
						}
				
				case 2:
					if(user.equals("����")) {
						System.out.println("���� �й�");
						user_m -= 50;
						com_m += 50;
						System.out.println("�÷��̾�� ���ӸӴ� 50�� �Ҿ����ϴ�!");
						System.out.println("�÷��̾��� �����ݾ�: " + user_m +"��");
						System.out.println("��ǻ�Ͱ� �����ݾ�: " + com_m +"��");
						break;
						}
					if(user.equals("����")) {
						System.out.println("���º�");
						break;
						}
					if(user.equals("��")) {
						System.out.println("���� �¸�");
						user_m += 50;
						com_m -= 50;
						System.out.println("�÷��̾�� ���ӸӴ� 50�� ������ϴ�!");
						System.out.println("�÷��̾��� �����ݾ�: " + user_m +"��");
						System.out.println("��ǻ�Ͱ� �����ݾ�: " + com_m +"��");
						break;
						}
					
				case 3:
					if(user.equals("����")) {
						System.out.println("���� �¸�");
						user_m += 50;
						com_m -= 50;
						System.out.println("�÷��̾�� ���ӸӴ� 50�� ������ϴ�!");
						System.out.println("�÷��̾��� �����ݾ�: " + user_m +"��");
						System.out.println("��ǻ�Ͱ� �����ݾ�: " + com_m +"��");
						break;
						}
					if(user.equals("����")) {
						System.out.println("���� �й�");
						user_m -= 50;
						com_m += 50;
						System.out.println("�÷��̾�� ���ӸӴ� 50�� �Ҿ����ϴ�!");
						System.out.println("�÷��̾��� �����ݾ�: " + user_m +"��");
						System.out.println("��ǻ�Ͱ� �����ݾ�: " + com_m +"��");
						break;
						}
					if(user.equals("��")) {
						System.out.println("���º�");
						break;
					    }
					
					default: { //user�� �߸��� ���� �Է� ���� ���
						System.out.println("�߸� �Է� �߽��ϴ�. �ٽ� �Է����ּ���.");
						break;
						}
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



