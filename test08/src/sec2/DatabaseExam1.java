package sec2;

public class DatabaseExam1 {

	public static void main(String[] args) {
		Database db;	// 객체 선언
		db = new Oracle();
		db.connect(Oracle.URL, Oracle.PORT+"", Oracle.ID, Oracle.PW);
		db.select("board", " where title like \'%\'+알림+\'%\'");
		db.insert("board", "제목11", 11);
		System.out.println();
		
		db = new Mysql();
		db.connect(Mysql.URL, Mysql.PORT+"", Mysql.ID, Mysql.PW);
		db.select("board", " where title like \'%\'+알림+\'%\'");
		db.insert("board", "제목11", 11);
		System.out.println();
		
		db = new MariaDB();
		db.connect(MariaDB.URL, MariaDB.PORT+"", MariaDB.ID, MariaDB.PW);
		db.select("board", " where title like \'%\'+알림+\'%\'");
		db.insert("board", "제목12", 12);
		
		// 추상체는 객체 선언 불가
//		db = new Database(); 
	}

}
