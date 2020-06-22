package edu0418.day2;

import edu0418.day1.Usb;

public class Pc {
	
	private Usb usb;
	
	public Pc(Usb usb) {
		this.usb=usb;
	}
	public void useUsb() {
		usb.open();
	}

}
