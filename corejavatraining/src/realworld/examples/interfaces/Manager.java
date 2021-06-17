package realworld.examples.interfaces;

public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchListener switchListener = new GEAppliances();
		//new HavellsAppliances();
switchListener.switchOne();
switchListener.switchTwo();
switchListener.switchThree();
switchListener.switchFour();
switchListener.wifiSwitch();
	}

}
