/** 
*The purpose of this class is to model a television
*Justin Johnson and 2/20/2020
*/

public class Television {
	//The brand of manufacturer of the TV
	private final String MANUFACTURER;
	//The size of the screen
	private final int SCREEN_SIZE;
	//is true when the power is on
	private boolean powerOn;
	//The channel of the tv, and the volume where 0 is no sound
	private int channel,volume;
	
	//Creates the TV while setting the manufacturer and size. By default the power is off, 
	//the volume is 20 and the channel is 2.
	public Television(String brand, int size) {
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	//Sets the channel to the parameter;
	public void setChannel(int station) {channel = station;}
	//Toggles the power
	public void power() {powerOn = !powerOn;}
	//Increases the power by 1
	public void increaseVolume() {volume++;}
	//Decreases the power by 1
	public void decreaseVolume() {volume--;}
	//returns the channel
	public int getChannel() {return channel;}
	//returns the volume
	public int getVolume() {return volume;}
	//returns the screen size
	public int getScreenSize() {return SCREEN_SIZE;}
	//returns the manufacturer
	public String getManufacturer() {return MANUFACTURER;}

	
}
