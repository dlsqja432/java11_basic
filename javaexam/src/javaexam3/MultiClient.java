package javaexam3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MultiClient {

	public static void main(String[] args) {
		MultiClient multiClient = new MultiClient();
		multiClient.start();
	}
	
	public void start() {
		Socket socket = null;
		BufferedReader in = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket("127.0.0.1", 8124);
			System.out.println("[서버와 연결되었습니다.]");
			
			System.out.print("이름 입력 : ");
			String name = sc.nextLine();
			Thread sendThread = new SendThread(socket, name);
			sendThread.start();
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(in != null) {
				String inMsg = in.readLine();
				if(inMsg.equals("quit")) break;
				System.out.println("From : " + inMsg);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("[서버 연결종료]");
	}
}
