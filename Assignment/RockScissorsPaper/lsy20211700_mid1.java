package soyeon;

import java.util.Scanner;

public class lsy20211700_mid1 {
	public static void main(String[] args) {
		
		int com = 0 , user = 0;
		int com_m = 100; //게임머니설정
		int user_m = 100; //게임머니 설정
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임입니다.");
		System.out.println("-----------------------");
		System.out.println("번호를 입력해주세요.");
		System.out.println("가위:1 바위:2 보:3 게임 종료:4");
		System.out.println("-----------------------");
		System.out.println("플레이어의 게임머니는 100입니다.");
		System.out.println("컴퓨터의 게임머니는 100입니다.");
		
		while(true) {
			com = (int)(Math.random() * 3) + 1;
			user = scanner.nextInt();
			
			int num = com - user;
		if(num == -2 || num == 1) {
			System.out.println("게임 패배");
			user_m -= 50;
			com_m += 50;
			System.out.println("플레이어는 게임머니 50을 잃었습니다!");
			System.out.println("플레이어의 남은금액: " + user_m +"원");
			System.out.println("컴퓨터가 남은금액: " + com_m +"원");
		} else if(num == -1 || num == 2) {
			System.out.println("게임 승리");
			user_m += 50;
			com_m -= 50;
			System.out.println("플레이어는 게임머니 50을 얻었습니다!");
			System.out.println("플레이어의 남은금액: " + user_m +"원");
			System.out.println("컴퓨터가 남은금액: " + com_m +"원");
		} else if(num == 0) {
			System.out.println("무승부입니다.");
		} else if(user == 4) {
			System.out.println("게임이 종료됩니다.");
			break;
		} else if(user > 4 || user < 1) {
			System.out.println("잘못된 숫자입니다. 다시 입력해주세요.");
		}
		
		if (user_m == 200 || com_m == 0) {
			System.out.println("플레이어가 승리했습니다!");
		break; } 
		else if (user_m == 0 || com_m == 200){
			System.out.println("플레이어가 패배했습니다!");
			break;} 
		
			
		}

	}

}