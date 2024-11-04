package com.oop.rooms;

public  class Customer extends Person {
	
	
	private Room room;
	private String roomId;
	public Customer(String id,String name,String contactNo, Room room )
	{
		super(id,name,contactNo);
		this.room = room;
	}
	public void rentRoom() {
		this.roomId=room.getRoomID();
	}
 @override
 void show()
 {
	 System.out.println("customer info         :");
	 System.out.println("customer id           :"+super.id);
	 System.out.println("customer name         :"+super.name);
	 System.out.println("customer contact num  :"+super.contactNo);
	 System.out.println("customer roomInfo     :"+roomId);
 }
}
