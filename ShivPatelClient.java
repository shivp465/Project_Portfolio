import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ShivPatelClient {
	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket("192.168.1.188", 5000);

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		PrintStream ps = new PrintStream(socket.getOutputStream());

		String str;

		do {
			str = br1.readLine();
			ps.println(str);
			str = br2.readLine();
			System.out.println("From Server: " + str);

		} while (!str.equals("nif"));
		socket.close();
	}
}