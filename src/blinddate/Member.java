package blinddate;

public class Member {
	
	private String name = "";
	private int age = 20;
	private int gender = -1;
	private String residence = "";
	private String contact = "";
	private String introduction = "";
	private int blindDateNumber = 0;
	
	public Member(String name, int age, int gender, String residence) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.residence = residence;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getGender() {
		return gender;
	}

	public String getResidence() {
		return residence;
	}

	public String getContact() {
		return contact;
	}

	public String getIntroduction() {
		return introduction;
	}

	public int getBlindDateNumber() {
		return blindDateNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public void setBlindDateNumber(int blindDateNumber) {
		this.blindDateNumber = blindDateNumber;
	}
	
}
