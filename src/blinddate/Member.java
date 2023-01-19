package blinddate;

public class Member {
	
	String name = "";
	String birthDay = "";
	int gender = 0;
	String residence = "";
	String contact = "";
	String introduction = "";
	int blindDateNumber = 0;
	
	private String ID = "";
	private String PW = "";
	
	public Member(String name, String birthDay, int gender, String residence, String ID, String PW) {
		super();
		this.name = name;
		this.birthDay = birthDay;
		this.gender = gender;
		this.residence = residence;
		this.ID = ID;
		this.PW = PW;
	}

	public String getID() {
		return ID;
	}
	public String getPW() {
		return PW;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public void setPW(String pW) {
		PW = pW;
	}

	@Override
	public String toString() {
		String str = "이름 : "+name+"\n";
		str += "생년월일 : "+birthDay+"\n";
		if (gender == 1) str += "성별 : 남\n";
		else str += "성별 : 여\n";
		str += "거주지 : "+residence+"\n";
		str += "연락쳐 : "+contact+"\n";
		str += "자기소개 : "+introduction+"\n";
		str += "소개팅 횟수 : "+Integer.toString(blindDateNumber)+"\n";
		str += "ID : "+ID+"\n";
		str += "PW : "+PW+"\n";
		return str;
	}
	
}
