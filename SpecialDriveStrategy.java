package StrategyDesignPattern;

public class SpecialDriveStrategy implements IDriveStrategy{

	@Override
	public void drive() {
		System.out.print("special drive");
	}

}
