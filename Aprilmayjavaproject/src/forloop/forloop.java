package forloop;

import java.util.ArrayList;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i  + "  hi");
//			
//		}
		ArrayList<String> MYshoppinglist =new ArrayList<>();
		MYshoppinglist.add("Milk");
		MYshoppinglist.add("Pototo");
		MYshoppinglist.add("Onions");
		MYshoppinglist.add("Green Chillis");
		MYshoppinglist.add("Selt");
		MYshoppinglist.add("sweet");
		MYshoppinglist.add("Banana");
		MYshoppinglist.add("Apple");


		
		
		System.out.println(MYshoppinglist.size());
		System.out.println(MYshoppinglist.get(0));
		System.out.println(MYshoppinglist.get(MYshoppinglist.size()-1));
		
		for (int i = 0; i < MYshoppinglist.size(); i++) {
			System.out.println(i+" =  "+MYshoppinglist.get(i));
			
			
		}




	}

}
