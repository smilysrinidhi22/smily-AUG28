package com.oop.rooms;

public class StandardRoom extends Room{
	private boolean ac_availability;
	
	public StandardRoom(String roomID, int roomNum,double roomFare,boolean ac_availability)
	{
		super(roomID,roomNum,roomFare);
		this.ac_availability=ac_availability;
		
	}
	@override
	void roomInfo() {
		System.out.println("Standard room info   : ");
		System.out.println("Room ID  : " +super.getRoomID());
		System.out.println("room number : "+super.getRoomNum());
		System.out.println("room fare  : "+super.getRoomFare());
		System.out.println("room ac availability  : "+this.ac_availability);
     System.out.println();
	}

}
