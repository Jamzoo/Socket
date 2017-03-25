package SocketWork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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

		BufferedReader br = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));
		String str = null;
		
		FileWriter fis = new FileWriter("d:\\abc.mp3");
		BufferedWriter bis = new BufferedWriter(fis);
		//String len = null;
		//char[] buf = new char[1024*1024];
		while((str = br.readLine())!=null){
			bis.write(str);
			//bis.newLine();
		}
		br.close();
		bis.close();
		socket.close();
		server.close();
	}

}
