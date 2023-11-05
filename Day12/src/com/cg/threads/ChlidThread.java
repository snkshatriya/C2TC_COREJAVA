package com.cg.threads;

public class ChlidThread extends Thread{
	int n;
	String msg;
	
	public void ChildThread(int n,String msg) {
		this.n=n;
		this.msg=msg;
	}
	public void run() {
		for(int i=1;i<=n;i++) {
			try {
				Thread.sleep(300);
			}
		
		catch(InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
			System.out.println(
		}
	}
	

}
