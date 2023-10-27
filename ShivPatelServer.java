import java.net.*;
import java.io.*;

public class ShivPatelServer extends Thread {
	Socket socket;

	public ShivPatelServer(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			PrintStream print = new PrintStream(socket.getOutputStream());

			String str;
			StringBuilder sb;
			do {
				str = buffer.readLine();

				sb = new StringBuilder(str);
				sb.reverse();
				str = sb.toString();

				print.println(str);

			} while (!str.equals("nif"));

			socket.close();
		} catch (Exception e) {
		}

	}

	public static void main(String[] args) throws Exception {
		
		ServerSocket server_s = new ServerSocket(5000);
		
		int i = 1;
		Socket skt;
		ShivPatelServer sps;
		do {
			skt = server_s.accept();
			System.out.println("Client Connected :" + i++);
			sps = new ShivPatelServer(skt);
			sps.start();

		} while (true);

	}
}