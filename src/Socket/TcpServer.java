package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) throws IOException {
		System.out.println("���Ƿ�������");
		ServerSocket server = new ServerSocket(8888);
		Socket socket = server.accept();

		BufferedReader br = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));

		String str = null;
		str = br.readLine();
		System.out.println("�ͻ��˵�����" + str);

		br.close();
		socket.close();
		server.close();
	}

}
