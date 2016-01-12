import java.util.Random;
public class FlyingCow extends Cow{
	private Random rando = new Random();
	private String name;
	private int hungriness;
	private int age;
	private int sicknessLevel;
	private int x;
	private int y;
	public FlyingCow(int x, int y, String name){		//creates new fields, since Cow's fields are private
		super(x, y, name);
		this.x=x;
		this.y=y;
		this.name=name;
		this.age=0;
		this.hungriness=0;
		this.sicknessLevel=0;
	}
	@Override
	public void doStuffForAnHour(int hour){				//cow moves to a random location on the grid
		int newX=rando.nextInt(500);					//method otherwise identical to super
		int newY=rando.nextInt(500);
		if(Farm.getGrid()[newX][newY]==null){
			this.move(newX, newY);
		}
		if(Farm.getGrid()[newX][newY] instanceof Grass){
			this.eat(Farm.getGrid()[newX][newY]);
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