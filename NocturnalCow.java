public class NocturnalCow extends Cow{
	public NocturnalCow(){
			//please help 
	}
	
	@override
	public void doStuffForAnHour(int hour){
		if(hour >= 18 && hour <= 6){
			int a = rand.nextInt(4);
			if (a==0&&x!=500&&y!=500){
				if(Farm.getGrid[x+1][y+1]==null){
					this.move(x+1, y+1);
				}
				if(Farm.getGrid[x+1][y+1] instanceof Grass){
					this.eat(Farm.getGrid[x+1][y+1]);
				}
			}
			if (a==1&&x!=500&&y!=0){
				if(Farm.getGrid[x+1][y-1]==null){
					this.move(x+1, y-1);
				}
				if(Farm.getGrid[x+1][y-1] instanceof Grass){
					this.eat(Farm.getGrid[x+1][y-1]);
				}
			}
			if (a==2&&x!=0&&y!=500){
				if(Farm.getGrid[x-1][y+1]==null){
					this.move(x-1, y+1);
				}
				if(Farm.getGrid[x-1][y+1] instanceof Grass){
					this.eat(Farm.getGrid[x-1][y+1]);
				}
			}
			if (a==3&&x!=0&&y!=0){
				if(Farm.getGrid[x-1][y-1]==null){
					this.move(x-1, y-1);
				}
				if(Farm.getGrid[x-1][y-1] instanceof Grass){
					this.eat(Farm.getGrid[x-1][y-1]);
				}
			}
		}
		hungriness+=2; age++;
		if(hungriness>=100||age>=90001){
			Farm.removeObject(this);
		}
		int b=rand.nextLong(1000000/age/sicknessLevel);
		if(b==0){
			Farm.removeObject(this);
		}

	}
}
