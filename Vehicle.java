package StrategyDesignPattern;

public class Vehicle {
	private IDriveStrategy _drivestrategy;
	public Vehicle(IDriveStrategy drivestrategy)
	{
		this._drivestrategy=drivestrategy;
	}
	public void drive()
	{
		_drivestrategy.drive();
	}

}
