package org.kh.object1;

public class Member {
	
	private String id;
	private String pw;
	private String email;
	private String birth;
	private String tel;
	
	
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	void showInfo() {
		System.out.println("ID : " + id);
		System.out.println("PW : " + pw);
		System.out.println("EMAIL : " + email);
		System.out.println("BIRTH : " + birth);
		System.out.println("TEL : " + tel);
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", email=" + email + ", birth=" + birth + ", tel=" + tel + "]";
	}
}
