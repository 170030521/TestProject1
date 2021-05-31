package com.vm.training.java.oops;

public abstract class Car implements IVehicle{
public void steering() {
		
		System.out.println("power steering");
	}

	@Override
	public void brakes() {
		
		System.out.println("disk brakes");
	}

	@Override
	public void accelerator() {
		System.out.println("fdgd");	
		
	}

	@Override
	public void clutches() {
		System.out.println("based on gears");
	}

	@Override
	public int gears() {
		System.out.println("power steering");
		return 5;
	}
	
	
	

}


