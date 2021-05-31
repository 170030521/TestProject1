package com.cm.training.java.assignments;

public class Mobile {
	int Ram;
	int Internalstorage;
	int FrontCame;
	int BackCame;
	int Battery;
	String Processer;
	public Mobile(int ram, int internalstorage, int frontCame, int backCame, int battery, String processer) {
		super();
		Ram=ram;
		Internalstorage = internalstorage;
		FrontCame = frontCame;
		BackCame = backCame;
		Battery = battery;
		Processer = processer;
	}
	@Override
	public String toString() {
		return "Mobile [Ram=" + Ram + ", Internalstorage=" + Internalstorage + ", FrontCame=" + FrontCame
				+ ", BackCame=" + BackCame + ", Battery=" + Battery + ", Processer=" + Processer + "]";
	}
	
	
	

}
