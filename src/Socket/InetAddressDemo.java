package Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress host = InetAddress.getByName("www.baidu.com");
		
		System.out.println(host.getHostName());
		System.out.println(host.getHostAddress());
		System.out.println(host.getLocalHost());
	}
}
