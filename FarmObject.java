public abstract class FarmObject{
	private int x;
	private int y;
	public abstract void doStuffForAnHour(int hour);
	public void remove(){
		removeObject(x,y);
	}
	public FarmObject(int x, int y){
		this.x=x;
		this.y=y;
		Farm.addObj(this);
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}
