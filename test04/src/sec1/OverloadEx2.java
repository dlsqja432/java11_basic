package sec1;

public class OverloadEx2 {

	public static void main(String[] args) {

		Book b1 = new Book();
		b1.setBno(101);
		b1.setBname("정보처리 기사");
		b1.setPrice(42000);
		b1.setAuthor("장인범");
		b1.setPub("한빛미디어");
		
		Book b2 = new Book();
		b2.setBno(102);
		b2.setBname("자바프로그래밍입문");
		b2.setPrice(25000);
		b2.setAuthor("엄지훈");
		b2.setPub("이지스퍼블리싱");
		
		Book b3 = new Book();
		b3.setBno(103);
		b3.setBname("HTML/CSS 웹 표준");
		b3.setPrice(28000);
		b3.setAuthor("김대희");
		b3.setPub("응애미디어");
		
		Book b4 = new Book();
		b4.print();
		b4.print(b1.getBname(), b1.getPrice(), b1.getAuthor());
	}

}
