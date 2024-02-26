package sec1;
// 필드 : 번호, 국어, 영어, 수학
// 메소드 : getter / setter 및 총점, 평균, 학점, 모든 학생 정보 출력
public class Student {
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {}
	
	public Student(int no, int kor, int eng, int math) {
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int studentSum() {
		return this.kor + this.eng + this.math;
	}
	
	public double studentAvg() {
		return (studentSum()/3.0);
	}
	
	public String studentScore() {
		if(studentAvg() >= 90.0) {
			return "A";
		}
		else if(studentAvg() >= 80.0) {
			return "B";
		}
		else if(studentAvg() >= 70.0) {
			return "C";
		}
		else if(studentAvg() >= 60.0) {
			return "D";
		}
		else
			return "F"; 
	}
	
	public void showInfo() {
		System.out.println(no+"\t" + kor +"\t" +eng+"\t" +math+"\t" +studentSum() +"\t" + studentAvg() +"\t" + studentScore());
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
}
