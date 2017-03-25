package SocketWork;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) throws IOException {
		System.out.println("服务端已开启,等待客户端请求：");
		ServerSocket server = new ServerSocket(8888);
		Socket socket = server.accept();

		BufferedInputStream bw = new BufferedInputStream(socket.getInputStream());
		BufferedOutputStream bis = new BufferedOutputStream(new FileOutputStream("d:\\abc.mp3"));
		int str = 0;
		
		//FileWriter fis = new FileWriter("d:\\abc.mp3");
		//BufferedWriter bis = new BufferedWriter(fis);
		//String len = null;
		byte[] buf = new byte[1024*1024];
		while((str = bw.read(buf))!=-1){
			//bis.write(str);
			//byte[] by =str.getBytes();
			bis.write(buf, 0, str);
			//bis.newLine();
		}
		bw.close();
		bis.close();
		socket.close();
		server.close();
	}

}
