package edu0418.day2;

public class SonyPrint extends AbstractPrint{

	@Override
	void open() {
		// TODO Auto-generated method stub
		System.out.println("*********************");
	}

	@Override
	void print(String txt) {
		// TODO Auto-generated method stub
		System.out.println(txt);
	}

	@Override
	void end() {
		System.out.println("Sony CO,.LTD.");
		// TODO Auto-generated method stub
		
	}

}
