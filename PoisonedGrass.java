import java.util.Random;
public class PoisonedGrass extends Grass{
	private int grassAmount;				//creates new fields, since Grass's fields are private
	private int x;
	private int y;
	public PoisonedGrass(int x, int y){
		super(x,y);
		this.x=x;
		this.y=y;
		this.grassAmount = 0;
	}	
	public void doStuffForAnHour(){			//does exactly the same as grass, but grows faster
		super();
		this.grassAmount ++;				//sickening functionality included in the Cow class
	}
}