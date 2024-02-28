package sec1;

public class Member extends User {
	private String id;
	private String pw;
	
	@Override
	public void connect() {
		System.out.println("회원으로 연결하였습니다.\n ID : " + id + ", PW : ********");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}
