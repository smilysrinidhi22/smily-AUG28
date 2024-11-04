package com.oop.rooms;

public class Main {
	public static void main(String[] args) {
		DeluxeRoom deluxeRoom= new DeluxeRoom("delux-12",11,1200.50,35.25);
		deluxeRoom.roomInfo();
		
		StandardRoom standardRoom=new StandardRoom("standard-22",22,1000.50,true);
		standardRoom.roomInfo();
		
		Customer cr= new Customer("173","suresh","0998", standardRoom);
		cr.rentRoom();
		cr.show();
		
	}

}
