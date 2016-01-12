public class Farm{
	private FarmObject[][] farmGrid = new FarmObject[World.getGridSize()][World.getGridSize()];
	private FarmObject[] existingObjects = new FarmObject[20];
	public static void removeObject(int x, int y){
		farmGrid[x][y]=null;
	}
}