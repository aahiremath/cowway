import java.util.Random;
public class PoisonedGrass extends Grass{
	private int grassAmount;
	private int x;
	private int y;
	public PoisonedGrass(int x, int y){
		super(x,y);
		this.x=x;
		this.y=y;
		this.grassAmount = 0;
	}	
	public void doStuffForAnHour(){
		super();
		this.grassAmount ++;
	}
}