package javaexam2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient {

	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket("127.0.0.1", 6123);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				System.out.print("client에서 server로 전송 : ");
				String outMsg = sc.nextLine();
				out.println(outMsg);
				out.flush();
				if(outMsg.equalsIgnoreCase("quit")) break;
				
				String inMsg = in.readLine();
				System.out.println("[From Server : " + inMsg + "]");
				if(inMsg.equalsIgnoreCase("quit")) break;
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
			if(socket != null) {
				try {
					socket.close();
					System.out.println("[서버 연결 종료]");
				} catch (IOException e) {
					System.out.println("[소켓 통신 종료 오류]");
					e.printStackTrace();
				}
			}
		}
	}
}
