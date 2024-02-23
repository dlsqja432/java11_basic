package sec1;

public class Book {

	private int bno;
	private String bname;
	private int price;
	private String author;
	private String pub;
	
	public void print() {
		System.out.println("입력된 값이 없습니다.");
	}
	
	public void print(int bno) {
		System.out.println("교재코드 : " + bno);
	}
	
	public void print(int bno, String bname) {
		System.out.println("교재코드 : " + bno);
		System.out.println("교재명 : " + bname);
	}
	
	public void print(String bname, int price, String author) {
		System.out.println("교재명 : " + bname);
		System.out.println("가격 : " + price);
		System.out.println("저자 : " + author);
	}
	
	public void print(int bno, String bname, int price, String author) {
		System.out.println("교재코드 : " + bno);
		System.out.println("교재명 : " + bname);
		System.out.println("가격 : " + price);
		System.out.println("저자 : " + author);
	}
	
	public void print(int bno, String bname, int price, String author, String pub) {
		System.out.println("교재코드 : " + bno);
		System.out.println("교재명 : " + bname);
		System.out.println("가격 : " + price);
		System.out.println("저자 : " + author);
		System.out.println("출판사 : " + pub);
	}
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	
	
}
