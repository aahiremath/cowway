]public class Cow extends FarmObject{
	private String name;
	private int hungriness;
	private int age;
	private int sicknessLevel;
	
	public void doStuffForAnHour(int hour){
		if(hour<=18&&hour>=6){
			Random rand = new Random();			//movie in random direction
			int direction = rand.nextInt(4);
			if( direction == 0){		
				x ++;
			}else if (direction == 1){
				x--;
			} else if (direction == 2){
				y++;
			} else {
				y--;
			}
		}
	}
}