import java.applet.*;
import java.awt.*;

public class ClockApplet extends Applet implements Runnable {
public void run() {
	while (true) {
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {}
		repaint();
	}
}
public void start() {
	if (clockThread == null){
		clockThread = new Thread(this);
		clockThread.start();
	}
	else
		clockThread.resume();
}
public void stop(){
	if (clockThread != null)
		clockThread.suspend();
}
public void destroy(){
	if (clockThread != null) {
		clockThread.stop();
		clockThread = null;
	}
}
public void paint(Graphics g){
	g.drawString(new java.util.Date().toString(), 10, 30);
}
private Thread clockThread;
}
