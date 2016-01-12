public abstract class FarmObject{
	private int x;
	private int y;
	public abstract void doStuffForAnHour(int hour);
	public void remove(){
		Farm.removeObject(this);
	}
	public FarmObject(int x, int y){
		this.x=x;
		this.y=y;
		Farm.addObject(this);
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void changeX(int newX){
		x=newX;
	}
	public void changeY(int newY){
		y=newY;
	}
}
