package blinddate;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class BlindDateManager {
	
	private LinkedList<Member> maleMemberList = new LinkedList<>();
	private LinkedList<Member> femaleMemberList = new LinkedList<>();
	private HashMap<String, BlindDate> blindDateList = new HashMap<>();
	
	Scanner scan = new Scanner(System.in);
	
	public BlindDateManager() {
		super();
		makeMemberList();
		menu();
	}

	public LinkedList<Member> getMaleMemberList() {
		return maleMemberList;
	}
	public LinkedList<Member> getFemaleMemberList() {
		return femaleMemberList;
	}
	public HashMap<String, BlindDate> getBlindDateList() {
		return blindDateList;
	}
	public void setMaleMemberList(LinkedList<Member> maleMemberList) {
		this.maleMemberList = maleMemberList;
	}
	public void setFemaleMemberList(LinkedList<Member> femaleMemberList) {
		this.femaleMemberList = femaleMemberList;
	}
	public void setBlindDateList(HashMap<String, BlindDate> blindDateList) {
		this.blindDateList = blindDateList;
	}
	
	public void makeMemberList() {
		
	}
	
	public void saveMemberList() {
		
	}
	
	public void printMemberList() {
		System.out.println("=====<< 남성회원 리스트 >>=====");
		for (int i = 0; i < maleMemberList.size(); i++) {
			System.out.print(maleMemberList.get(i).toString());
			System.out.println("===========================");
		}
		
		System.out.println("\n=====<< 여성회원 리스트 >>=====");
		for (int i = 0; i < femaleMemberList.size(); i++) {
			System.out.println(femaleMemberList.get(i).toString());
			System.out.println("===========================");
		}
		
		debuggingMenu();
	}
	
	public void menu() {
		int menu = -1;
		
		while ((0 > menu) || (menu > 3)) {
			System.out.println("=====<< Menu >>=====");
			System.out.println("[1] 로그인");
			System.out.println("[2] 회원가입");
			System.out.println("[3] 탈퇴");
			System.out.println("[0] 종료");
			System.out.println("--------------------");
			System.out.print("메뉴 : ");
			menu = scan.nextInt();
			scan.nextLine();
			System.out.println("====================");
			
			if (menu == 99) debuggingMenu();
			
			if ((0 > menu) || (menu > 3)) {
				System.out.println("올바르지 않은 메뉴입니다. 다시 입력해주세요.");
			}
		}
		
		switch(menu) {
		case 0 : System.out.println("이용해주셔서 감사합니다."); saveMemberList(); System.exit(0);
		case 1 : logIn();
		case 2 : signUp();
		case 3 : deleteAccount();
		}
	}
	
	public void debuggingMenu() {
		int menu = -1;
		
		while ((0 > menu) || (menu > 1)) {
			System.out.println("\n=====<< 디버깅 모드 >>=====");
			System.out.println("[1] 회원 리스트 출력");
			System.out.println("[0] 종료");
			System.out.println("--------------------------");
			System.out.print("메뉴 : ");
			menu = scan.nextInt();
			scan.nextLine();
			System.out.println("==========================\n");
			
			if ((0 > menu) || (menu > 1)) {
				System.out.println("올바르지 않은 메뉴입니다. 다시 입력해주세요.");
			}
		}
		
		switch(menu) {
		case 0 : menu();
		case 1 : printMemberList();
		}
	}

	public void signUp() {
		String name;
		String birthDay;
		int gender;
		String residence;
		
		String ID, PW;
		
		System.out.print("이름 : ");
		name = scan.nextLine().trim();
		System.out.print("생년월일(ex 2000/00/00) : ");
		birthDay = scan.nextLine().trim();
		System.out.print("성별(남:1 / 여:2) : ");
		gender = scan.nextInt();
		scan.nextLine();
		System.out.print("거주지(ex 서울시) : ");
		residence = scan.nextLine().trim();
		
		System.out.print("\nID : ");
		ID = scan.nextLine().trim();
		for (int i = 0; i < maleMemberList.size(); i++) {
			if (maleMemberList.get(i).getID().equals(ID)) {
				System.out.println("이미 사용중인 ID입니다. 다시 입력해주세요.");
				System.out.print("ID : ");
				ID = scan.nextLine().trim();
			}
		}
		for (int i = 0; i < femaleMemberList.size(); i++) {
			if (femaleMemberList.get(i).getID().equals(ID)) {
				System.out.println("이미 사용중인 ID입니다. 다시 입력해주세요.");
				System.out.print("ID : ");
				ID = scan.nextLine().trim();
			}
		}
		System.out.print("PW : ");
		PW = scan.nextLine().trim();
		
		if (gender == 1) maleMemberList.add(new Member(name, birthDay, gender, residence, ID, PW));
		else femaleMemberList.add(new Member(name, birthDay, gender, residence, ID, PW));
		
		System.out.println("회원가입이 완료되었습니다.\n");
		menu();
	}
	
	public void logIn() {
		
	}
	
	public void logInMenu() {
		
	}
	
	public void logOut() {
		System.out.println("로그아웃 되었습니다.");
		menu();
	}
	
	public void changeMemberInfo() {
		
	}
	
	public void deleteAccount() {
		String ID, PW;
		String answer;
		
		int c = 0;
		while (c == 0) {
			System.out.println("*뒤로가기 : ID에 \"0\"입력");
			System.out.print("ID : ");
			ID = scan.nextLine();
			System.out.print("PW : ");
			PW = scan.nextLine();
			
			if (ID.equals("0")) c = 1;
			
			for (int i = 0; i < maleMemberList.size(); i++) {
				if (maleMemberList.get(i).getID().equals(ID)) {
					if (maleMemberList.get(i).getPW().equals(PW)) {
						while (true) {
							System.out.print("계정을 삭제하시겠습니까?(y/n) : ");
							answer = scan.nextLine();
							if ((answer.equals("y")) || (answer.equals("Y"))) {
								maleMemberList.remove(i);
								System.out.println("계정이 삭제되었습니다.");
								c = 1;
								break;
							} else if ((answer.equals("n")) || (answer.equals("N"))) {
								System.out.println("탈퇴를 취소합니다.");
								c = 1;
								break;
							} else {
								System.out.println("다시 입력해주세요.");
							}
						}
					}
				}
			}
			for (int i = 0; i < femaleMemberList.size(); i++) {
				if (femaleMemberList.get(i).getID().equals(ID)) {
					if (femaleMemberList.get(i).getPW().equals(PW)) {
						while (true) {
							System.out.print("계정을 삭제하시겠습니까?(y/n) : ");
							answer = scan.nextLine();
							if ((answer.equals("y")) || (answer.equals("Y"))) {
								maleMemberList.remove(i);
								System.out.println("계정이 삭제되었습니다.");
								c = 1;
								break;
							} else if ((answer.equals("n")) || (answer.equals("N"))) {
								System.out.println("탈퇴를 취소합니다.");
								c = 1;
								break;
							} else {
								System.out.println("다시 입력해주세요.");
							}
						}
					}
				}
			}
			
			if (c == 0) {
				System.out.println("ID 또는 PW가 일치하지 않습니다. 다시 입력해주세요.");
			}
		}
		
		logInMenu();
	}
	
}
