
public interface TV {
	
	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 100;
	
	// 추상 클래스의 형태
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);

}
