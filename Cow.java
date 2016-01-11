public class Cow extends FarmObject{
	private Random rand = new Random();
	private String name;
	private int hungriness;
	private int age;
	private int sicknessLevel;
	public void doStuffForAnHour(int hour){
		if(hour<=18&&hour>=6){
			int a = rand.randInt(4);
			if (a==0&&x!=500&&y!=500&&Farm.getGrid[x+1][y+1]==null){
				move(x+1, y+1);
			}
			if (a==1&&x!=500&&y!=0&&Farm.getGrid[x+1][y-1]==null){
				move(x+1, y-1);
			}
			if (a==2&&x!=0&&y!=500&&Farm.getGrid[x-1][y+1]==null){
				move(x-1, y+1);
			}
			if (a==3&&x!=0&&y!=0&&Farm.getGrid[x-1][y-1]==null){
				move(x-1, y-1);
			}
		}
	}
	public void move(int newX, int newY){
		Farm.removeObject(this);
		this.x=newX;
		this.y=newY;
		Farm.addObject(this);
	}
}