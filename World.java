public class World{
	private Farm[] farms = new Farm[10];
	private int time;
	public void incrementTime(){
		if(time == 24){
			time = 1;
		}
		else{
			time++;
		}
	}
	public int getTime(){
		return time;
	}
}