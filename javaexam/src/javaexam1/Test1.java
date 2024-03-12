package javaexam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		ipInfoList는 ArrayList로 생성해야 하지만, null로 대입하였으므로 
//		13~15 문장은 NullPointerException이 발생한다.
//		List<IPInfo> ipInfoList = new ArrayList<>(); 로 바꿔줘야함
		List<IPInfo> ipInfoList = new ArrayList<>();
		ipInfoList.add(new IPInfo("123.123.123.123", "홍길동"));
//		IPInfo 클래스에서 매개변수 하나를 전달 받는 생성자(Constructor)는 없으므로 객체 생성 불가 
//		방법1) IPInfo 클래스에 매개변수 ip만 받는 생성자를 추가한다.
//		방법2) IPInfo 객체 생성시 ip와 user의 매개변수 값을 모두 넣는다.
//		ipInfoList.add(new IPInfo("212.133.7.8", "장인범"));	
		ipInfoList.add(new IPInfo("177.233.111.222", "고길순"));

		System.out.print("ip 입력 : ");
		String ip = sc.next();
		
		for(int i=0; i<ipInfoList.size(); i++) {
//			ipInfoList.get(i)는 특정 번째의 IPInfo 클래스의 객체이고, ip는 String 변수 이므로, 서로 다른
//			타입을 비교하는 것이기 때문에 오류가 발생함.
//			String 값의 비교는 equals 메소드를 사용해야 하므로 ipInfoList.get(i).getIp().equals(ip)
			if(ipInfoList.get(i).getIp().equals(ip)) {
				System.out.println(ipInfoList.get(i));
				break;
			}
		}
		
//		일치하는 ip가 없을때에만 이걸 출력해야 하는데, ip가 일치할 때도 출력되는 오류가 있다.
//		30번째 줄의 break;를 return;으로 바꿔준다.
		System.out.println("일치하는 ip 사용자가 없습니다.");
		sc.close();
	}
}
