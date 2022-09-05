package soyeon;

import java.util.Scanner;

public class lsy20211700_mid2 {
	public static void main(String[] args) {
		
		int com_m = 100; //게임머니 설정
		int user_m = 100; //게임머니 설정
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임입니다.");
		System.out.println("-----------------------");
		System.out.println("문자를 선택해 입력해주세요.");
		System.out.println("가위, 바위, 보");
		System.out.println("-----------------------");
		System.out.println("플레이어의 게임머니는 100입니다.");
		System.out.println("컴퓨터의 게임머니는 100입니다.");
		
		while(true) {
			int com = (int)(Math.random() * 3)+1;
			String user = scanner.nextLine();			
			
			switch (com) {
				case 1:
					if(user.equals("가위")) {
						System.out.println("무승부");
						break;
					}
					if(user.equals("바위")) {
						System.out.println("게임 승리");
						user_m += 50;
						com_m -= 50;
						System.out.println("플레이어는 게임머니 50을 얻었습니다!");
						System.out.println("플레이어의 남은금액: " + user_m +"원");
						System.out.println("컴퓨터가 남은금액: " + com_m +"원");
						break;
						}
					if(user.equals("보")) {
						System.out.println("게임 패배");
						user_m -= 50;
						com_m += 50;
						System.out.println("플레이어는 게임머니 50을 잃었습니다!");
						System.out.println("플레이어의 남은금액: " + user_m +"원");
						System.out.println("컴퓨터가 남은금액: " + com_m +"원");
						break;
						}
				
				case 2:
					if(user.equals("가위")) {
						System.out.println("게임 패배");
						user_m -= 50;
						com_m += 50;
						System.out.println("플레이어는 게임머니 50을 잃었습니다!");
						System.out.println("플레이어의 남은금액: " + user_m +"원");
						System.out.println("컴퓨터가 남은금액: " + com_m +"원");
						break;
						}
					if(user.equals("바위")) {
						System.out.println("무승부");
						break;
						}
					if(user.equals("보")) {
						System.out.println("게임 승리");
						user_m += 50;
						com_m -= 50;
						System.out.println("플레이어는 게임머니 50을 얻었습니다!");
						System.out.println("플레이어의 남은금액: " + user_m +"원");
						System.out.println("컴퓨터가 남은금액: " + com_m +"원");
						break;
						}
					
				case 3:
					if(user.equals("가위")) {
						System.out.println("게임 승리");
						user_m += 50;
						com_m -= 50;
						System.out.println("플레이어는 게임머니 50을 얻었습니다!");
						System.out.println("플레이어의 남은금액: " + user_m +"원");
						System.out.println("컴퓨터가 남은금액: " + com_m +"원");
						break;
						}
					if(user.equals("바위")) {
						System.out.println("게임 패배");
						user_m -= 50;
						com_m += 50;
						System.out.println("플레이어는 게임머니 50을 잃었습니다!");
						System.out.println("플레이어의 남은금액: " + user_m +"원");
						System.out.println("컴퓨터가 남은금액: " + com_m +"원");
						break;
						}
					if(user.equals("보")) {
						System.out.println("무승부");
						break;
					    }
					
					default: { //user가 잘못된 값을 입력 했을 경우
						System.out.println("잘못 입력 했습니다. 다시 입력해주세요.");
						break;
						}
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



