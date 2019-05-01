package arraylistdemo;

import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myArrayList =new ArrayList <String>();
		myArrayList.add("New York");
		myArrayList.add("New Jersey");
		myArrayList.add("Virgina");
		myArrayList.add("Maine");
		myArrayList.add("Mariland");
		
	int	TotalStateName =myArrayList.size();
	System.out.println(TotalStateName);
		String StateName =myArrayList.get(0);
		System.out.println(StateName);
		
	ArrayList<Integer> scores =new ArrayList<>();
		
			scores.add(500);
			scores.add(320);
			scores.add(125);
			scores.add(400);
			System.out.println(scores.size());
			System.out.println(scores.get(0));
	}

}
