package chap12.ex01;

import java.awt.Toolkit;

public class BeepThread extends Thread{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<10; i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
	}
}}
