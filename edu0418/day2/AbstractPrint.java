package edu0418.day2;

abstract class AbstractPrint {
	
	abstract void open();
	
	abstract void print(String txt);
	
	abstract void end();
	
	public void run (String txt) {
		open();
		print(txt);
		end();
	}

}
