public abstract class FarmObject{
	private int x;
	private int y;
	public abstract void doStuffForAnHour(int hour);		//this can be called to make all FarmObject 
	public void remove(){									//children grow, eat, or do whatever they do
		Farm.removeObject(this);							
	}
	public FarmObject(int x, int y){						//constructor adds self to the farm
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
}
