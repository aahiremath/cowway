import java.util.Random;
public class NocturnalCow extends Cow{
	private Random rando = new Random();
	private String name;
	private int hungriness;
	private int age;
	private int sicknessLevel;
	private int x;
	private int y;
	public NocturnalCow(int x, int y, String name){		//creates new fields, since Cow's fields are private
		super(x, y, name);
		this.x=x;
		this.y=y;
		this.name=name;
		this.age=0;
		this.hungriness=0;
		this.sicknessLevel=0;
	}
	@Override
	public void doStuffForAnHour(int hour){
		if(hour<6&&hour>=18){							//method exactly the same as super, except that in this line the times are changed
			int a = rando.nextInt(4);
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
		int b=rando.nextInt(1000000/age/sicknessLevel);
		if(b==0){
			Farm.removeObject(this);
		}

	}
}