package WaterTank;

abstract class WaterTank {
	protected int capacity;
	protected int currentWaterLevel;
	
	public WaterTank(int capacity) {
		this.capacity = capacity;
		this.currentWaterLevel = 0;
	}
	
	public abstract void fillTank(int liters);
	public abstract void useWater(int liters);
	public abstract void checkStatus();
	
	

}
