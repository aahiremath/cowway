import java.util.Random;
public class Grass extends FarmObject{
	private int x;
	private int y;
	private int grassAmount;
	public Grass(int x, int y){
		super( x, y);
		this.x = x;
		this.y = y;
		this.grassAmount = 0;
	}
	public void doStuffForAnHour(int hour){
		grassAmount++;	//every hour, the amount of grass increases by 1
		Random rand = new Random();	//not sure percent of chance creating another patch before or after grass increases by 1 each hour so assumed after		
		if ( rand.nextInt(1000/grassAmount)==0){ //0.1% = 1 / 1000
			boolean breaker = true;
			while ( breaker){
				int b = rand.nextInt(4);
				if ( b == 0 && Farm.getGrid()[x][y+1] instanceof Cow == false){	
					Grass grass = new Grass(x, y+1);				//new grass patch
					breaker = false;
				}
				if ( b == 1 && Farm.getGrid()[x][y-1] instanceof Cow == false){	
					Grass grass = new Grass(x, y-1);		
					breaker = false;
				}
				if ( b == 2 && Farm.getGrid()[x - 1][y]instanceof Cow == false){	
					Grass grass = new Grass(x - 1, y);		
					breaker = false;
				}
				if ( b == 3 && Farm.getGrid()[x + 1][y] instanceof Cow == false){	
					Grass grass = new Grass(x + 1, y);	
					breaker = false;
				}
				if ( Farm.getGrid()[x][y + 1] instanceof Cow == true && Farm.getGrid()[x][y-1] instanceof Cow == true && Farm.getGrid()[x - 1][y]instanceof Cow == true && Farm.getGrid()[x + 1][y] instanceof Cow == true){
					breaker = false;
				}
			}
		}
	}
	public int getAmount(){
		return grassAmount;
	}
}