package edu0418.day2;

public class FujiPrint extends AbstractPrint{

	@Override
	void open() {
		// TODO Auto-generated method stub
		System.out.println("-------------");
	}

	@Override
	void print(String txt) {
		// TODO Auto-generated method stub
		System.out.println(txt);
	}

	@Override
	void end() {
		// TODO Auto-generated method stub
		System.out.println("Fuji CO,.LTD.");
	}

}
