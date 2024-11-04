package com.oop.rooms;

public class DeluxeRoom extends Room{
	private double roomSize;
	
	public DeluxeRoom(String roomID, int roomNum,double roomFare,double roomsize)
	{
		super(roomID, roomNum , roomFare);
		this.roomSize = roomSize;
	}
	
	@override
	void roomInfo()
	{
		System.out.println("deluxe room info   :");
		System.out.println("room id            : "+super.getRoomID());
		System.out.println("room nmber         :"+super.getRoomNum());
		System.out.println("room fare          :"+super.getRoomFare());
		System.out.println("room size          :"+this.roomSize);
		System.out.println();
	}

}
