package net.java;

public class vendingMachin {
	public double coinerecived = 0;
	private int cokeCapacity = 10;
	private int SpritCapacity = 10;
	private int WaterCapacity = 10;
	
	
	public void insertCoin(double coins) {
		coinerecived =coins;
			
	}
	// for Coke
	public void presscodeone() {
	if (cokeCapacity>=1) {
	
		if (coinerecived==2) {
			System.out.println("Please enjoy your coke");
			coinerecived=0;
			cokeCapacity =(cokeCapacity -1);
			
		}else if (coinerecived>2) {
			System.out.println("Please enjoy your coke");
			System.out.println("Here is youe change"+(coinerecived-2.00));
			coinerecived=0;
			cokeCapacity =(cokeCapacity -1);
			
		}else 
			System.out.println(" Please insert More coins"+(coinerecived-2.00));
			
		}else {
			System.out.println("Coke is out of Stock");
			System.out.println(" Please insert take your coins"+coinerecived);
		}
		
	}
// for Sprit
	public void presscodetwo() {
		if (SpritCapacity>=1) {
			if (coinerecived==2.30) {
				System.out.println("Please enjoy your Sprit");
				coinerecived=0;
				SpritCapacity= (SpritCapacity-1);
			}else if (coinerecived>2.30) {
				System.out.println("Please enjoy your Sprit");
				System.out.println("Here is youe change"+(coinerecived-2.30));
				coinerecived=0;
				SpritCapacity = (SpritCapacity-1);
				
			}else 
				System.out.println(" Please insert More coins"+(coinerecived-2.30));
				
		}else {
			System.out.print("Sprit is Out of Stock");
		System.out.println(" Please insert take your coins"+coinerecived);
		}
		
		
	}
	// for Wate
	public void presscodeThree() {
		if(WaterCapacity>=1) {

			if (coinerecived==1.50) {
				System.out.println("Please enjoy your Water");
				coinerecived=0;
				WaterCapacity =(WaterCapacity-1);
				
			}else if (coinerecived>1.50) {
				System.out.println("Please enjoy your Water");
				System.out.println("Here is youe change "+(coinerecived-1.50));
				coinerecived=0;
				WaterCapacity=(WaterCapacity-1);
				
			}else 
				System.out.println(" Please insert More coins "+(coinerecived-1.50));
			
		}else {
			System.out.print("Water is out of Stock");
			System.out.println(" Please insert take your coins"+coinerecived);
		}
		
		
	}


}
