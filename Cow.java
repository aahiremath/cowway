public class Cow extends FarmObject{
	private Random rand = new Random();
	private String name;
	private int hungriness=0;
	private int age=0;
	private int sicknessLevel=0;
	public Cow(int x, int y, String name){
		super(x,y);
		this.name=name;
	}
	public void doStuffForAnHour(int hour){
		if(hour<=18&&hour>=6){
			int a = rand.randInt(4);
			if (a==0&&x!=500&&y!=500){
				if(Farm.getGrid[x+1][y+1]==null){
					this.move(x+1, y+1);
				}
				if(Farm.getGrid[x+1][y+1] instanceof Grass){
					this.eat(Farm.getGrid[x+1][y+1]);
				}
			}
			if (a==1&&x!=500&&y!=0){
				if(Farm.getGrid[x+1][y-1]==null){
					this.move(x+1, y-1);
				}
				if(Farm.getGrid[x+1][y-1] instanceof Grass){
					this.eat(Farm.getGrid[x+1][y-1]);
				}
			}
			if (a==2&&x!=0&&y!=500){
				if(Farm.getGrid[x-1][y+1]==null){
					this.move(x-1, y+1);
				}
				if(Farm.getGrid[x-1][y+1] instanceof Grass){
					this.eat(Farm.getGrid[x-1][y+1]);
				}
			}
			if (a==3&&x!=0&&y!=0){
				if(Farm.getGrid[x-1][y-1]==null){
					this.move(x-1, y-1);
				}
				if(Farm.getGrid[x-1][y-1] instanceof Grass){
					this.eat(Farm.getGrid[x-1][y-1]);
				}
			}
		}
		hungriness+=2; age++;
		if(hungriness>=100||age>=90001){
			Farm.removeObject(this);
		}

	}
	public void move(int newX, int newY){
		Farm.removeObject(this);
		this.x=newX;
		this.y=newY;
		Farm.addObject(this);
	}
	public void eat(Grass g){
		g
	}
}