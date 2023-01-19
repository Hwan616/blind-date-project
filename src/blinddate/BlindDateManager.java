package blinddate;

import java.util.HashMap;
import java.util.LinkedList;

public class BlindDateManager {
	
	private LinkedList<Member> maleMemberList = new LinkedList<>();
	private LinkedList<Member> femaleMemberList = new LinkedList<>();
	private HashMap<String, BlindDate> blindDateList = new HashMap<>();
	
	public BlindDateManager() {
		super();
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
	
	public void menu() {
		
	}

	public void signUp() {
		
	}
	
	public void logIn() {
		
	}
	
	public void logOut() {
		
	}
	
	public void changeMemberInfo() {
		
	}
	
	public void deleteAccount() {
		
	}
	
}
