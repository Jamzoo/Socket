package Socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {
	public static void main(String[] args) throws IOException {
		System.out.println("���ǿͻ���");
		Socket socket = new Socket("127.0.0.1", 8888);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				socket.getOutputStream()));
		System.out.println("�������������");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		bw.write(str);

		bw.close();
		socket.close();

	}
}
