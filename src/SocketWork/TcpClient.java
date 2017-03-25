package SocketWork;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {
	public static void main(String[] args) throws IOException {
		System.out.println("我是客户端");
		Socket socket = new Socket("127.0.0.1", 8888);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				socket.getOutputStream()));
		FileReader fis = new FileReader("F:\\CloudMusic\\G.E.M.邓紫棋 - 画 (Live Piano Session II).mp3");
		BufferedReader bis = new BufferedReader(fis);
		String len = null;
		//char[] buf = new char[1024*1024];
		while((len=bis.readLine())!=null){
			bw.write(len);
			//bw.newLine();
		}
		
		bis.close();
		bw.close();
		socket.close();

	}
}
