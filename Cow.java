import java.util.Random;
public class Cow extends FarmObject{
	private Random rand = new Random();
	private String name;
	private int hungriness=0;
	private int age=0;
	private int sicknessLevel=0;
	private int x;
	private int y;
	public Cow(int x, int y, String name){
		super(x,y);
		this.name=name;
		this.x=x;
		this.y=y;
	}
	public void doStuffForAnHour(int hour){
		if(hour<18&&hour>=6){
			int a = rand.nextInt(4);
			if (a==0&&x!=500&&y!=500){
				if(Farm.getGrid()[x+1][y+1]==null){
					this.move(x+1, y+1);
				}
				if(Farm.getGrid()[x+1][y+1] instanceof Grass){
					this.eat(Farm.getGrid()[x+1][y+1]);
				}
			}
			if (a==1&&x!=500&&y!=0){
				if(Farm.getGrid()[x+1][y-1]==null){
					this.move(x+1, y-1);
				}
				if(Farm.getGrid()[x+1][y-1] instanceof Grass){
					this.eat(Farm.getGrid()[x+1][y-1]);
				}
			}
			if (a==2&&x!=0&&y!=500){
				if(Farm.getGrid()[x-1][y+1]==null){
					this.move(x-1, y+1);
				}
				if(Farm.getGrid()[x-1][y+1] instanceof Grass){
					this.eat(Farm.getGrid()[x-1][y+1]);
				}
			}
			if (a==3&&x!=0&&y!=0){
				if(Farm.getGrid()[x-1][y-1]==null){
					this.move(x-1, y-1);
				}
				if(Farm.getGrid()[x-1][y-1] instanceof Grass){
					this.eat(Farm.getGrid()[x-1][y-1]);
				}
			}
		}
		hungriness+=2; age++;
		if(hungriness>=100||age>=90001){
			Farm.removeObject(this);
		}
		int b=rand.nextInt(1000000/age/sicknessLevel);
		if(b==0){
			Farm.removeObject(this);
		}

	}
	public void move(int newX, int newY){
		Farm.removeObject(this);
		this.changeX(newX);
		this.changeY(newY);
		Farm.addObject(this);
	}
	public void eat(Grass g){
		Farm.removeObject(g);
		this.move(g.getX(),g.getY());
		hungriness-=g.getAmount();
		if(g instanceof PoisonedGrass){
			sicknessLevel+=g.getAmount();
		}
	}
}