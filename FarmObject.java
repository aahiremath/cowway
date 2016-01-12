public abstract class FarmObject{
	private int x;
	private int y;
	public abstract void doStuffForAnHour(int hour);
	public static void remove(){
		removeObject(x,y);
	}
}