package sec2;

public class Board {
	private int bno;
	private String title;
	private String uName;
	private String content;
	private String author;
	private int visited;
	
	// 생성자 오버로딩
	public Board() {}
	
	public Board(int bno) {
		this.bno = bno;
	}
	
	public Board(int bno, String title) {
		this.bno = bno;
		this.title = title;
	}
	
	public Board(int bno, String title, String uName, String content) {
		this.bno = bno;
		this.title = title;
		this.uName = uName;
		this.content = content;
	}

	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", uName=" + uName + ", content=" + content + ", author="
				+ author + ", visited=" + visited + "]";
	}
	
	
}
