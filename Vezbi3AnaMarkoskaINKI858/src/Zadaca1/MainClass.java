package Zadaca1;

public class MainClass {

	public static void main(String[] args) {
		Avtomobil av = new Avtomobil("Mazda", "6", "Crna", 12400, 2013, "BT-000-AA" );
		
		av.prvMetod();
		System.out.println(av.vtorMetod());
	}
}
