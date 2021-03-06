public class Farm{
	private FarmObject[][] farmGrid = new FarmObject[500][500];		//the map of the farm
	private FarmObject[] existingObjects = new FarmObject[30];		
	public void removeObject(FarmObject obj){
		farmGrid[obj.getX()][obj.getY()]=null;
		for (int i = 0; i<20 ; i++){								
			if(existingObjects[i]==obj){			//looks for the object to be removed in existingObjects
				existingObjects[i]=null;
			}
		}
	}
	public void addObject(FarmObject obj){			
		for (int i = 0; i<20 ; i++){
			if(existingObjects[i]==null){			//looks for the first empty space to accomodate the new object
				existingObjects[i]=obj;
			}
		}
		farmGrid[obj.getX()][obj.getY()]=obj;
	}
	public void doFarmThings(){
		for(int i = 0; i<20; i++){
			existingObjects[i].doStuffForAnHour(World.getTime());		//iterates through the list of farmObjects and makes them each
		}																//go through an hour's worth of time, one at a time
		World.incrementTime();
	}
	public FarmObject[][] getGrid(){				//returns the grid for other classes to use
		return farmGrid;
	}

}