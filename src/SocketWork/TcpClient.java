package SocketWork;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {
	public static void main(String[] args) throws IOException {
		System.out.println("我是客户端");
		Socket socket = new Socket("127.0.0.1", 8888);

		BufferedOutputStream bw = new BufferedOutputStream(socket.getOutputStream());
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\CloudMusic\\bbb.mp3"));
		//BufferedReader bis = new BufferedReader(fis);
		int len = 0;
		byte[] buf = new byte[1024*1024];
		while((len=bis.read(buf))!=-1){
			bw.write(buf,0,len);
			//bw.newLine();
		}
		
		bis.close();
		bw.close();
		socket.close();

	}
}
