public class Farm{
	private FarmObject[][] farmGrid = new FarmObject[500][500];
	private FarmObject[] existingObjects = new FarmObject[30];
	private int latestObjIndex = 0;
	public void removeObject(FarmObject obj){
		farmGrid[obj.getX()][obj.getY()]=null;
		for (int i = 0; i<20 ; i++){
			if(existingObjects[i]==obj){
				existingObjects[i]=null;
			}
		}
	}
	public void addObject(FarmObject obj){
		for (int i = 0; i<20 ; i++){
			if(existingObjects[i]==null){
				existingObjects[i]=obj;
			}
		}
		farmGrid[obj.getX()][obj.getY()]=obj;
	}
	public void doFarmThings(){
		for(int i = 0; i<20; i++){
			existingObjects[i].doStuffForAnHour(World.getTime());
		}
		World.incrementTime();
	}
	public FarmObject[][] getGrid(){
		return farmGrid;
	}

}