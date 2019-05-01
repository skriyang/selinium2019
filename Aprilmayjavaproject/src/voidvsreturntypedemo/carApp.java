package voidvsreturntypedemo;

public class carApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car mycar = new car();
		int horsPower =mycar.gethorspower();
		System.out.println("Hors power ="+horsPower);
		
		String mycarmodel =mycar.getmoderl();
		System.out.println("Car Model ="+mycarmodel);
	}

}
