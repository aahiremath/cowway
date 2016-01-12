public class World{
	private Farm[] farms = new Farm[10]; //10 farms for now
	private int time; 					
	public void incrementTime(){		//increments time by one; resets to 1 after a day passes
		if(time == 24){
			time = 1;
		}
		else{
			time++;
		}
	}
	public int getTime(){				//returns the current time
		return time;
	}
}
