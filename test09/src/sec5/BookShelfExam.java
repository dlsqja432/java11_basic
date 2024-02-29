package sec5;
// Queue : FIFO(First In First Out) 구조 => task 작업 순서
// Stack : LIFO(Last In First Out) 구조 => 최근 작업 목록
public class BookShelfExam {

	public static void main(String[] args) {
		Queue que = new BookShelf();
		que.enQueue("장인범");
		que.enQueue("김대희");
		que.enQueue("박민수");
		System.out.println(que.getSize());
		System.out.println(que.deQueue());
		System.out.println(que.getSize());
		System.out.println(que.deQueue());
		System.out.println(que.getSize());
	}

}
