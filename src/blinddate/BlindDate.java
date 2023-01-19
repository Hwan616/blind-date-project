package blinddate;

public class BlindDate {
	
	private String date = "";
	private String place = "";
	private Member maleMember = null;
	private Member femaleMember = null;
	
	public BlindDate(String date, String place, Member maleMember, Member femaleMember) {
		super();
		this.date = date;
		this.place = place;
		this.maleMember = maleMember;
		this.femaleMember = femaleMember;
	}

	public String getDate() {
		return date;
	}

	public String getPlace() {
		return place;
	}

	public Member getMaleMember() {
		return maleMember;
	}

	public Member getFemaleMember() {
		return femaleMember;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setMaleMember(Member maleMember) {
		this.maleMember = maleMember;
	}

	public void setFemaleMember(Member femaleMember) {
		this.femaleMember = femaleMember;
	}
	
}
