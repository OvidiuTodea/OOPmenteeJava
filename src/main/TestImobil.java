package main;

public class TestImobil {

	public static void main(String[] args) {
		
		Imobil hotel = new Imobil();
		Imobil resedinta = new Imobil("casa cu etaj", 20000);
		Imobil garaj = new Imobil("garaj cu 2 locuri", 1, 2500);
		
		hotel.setTipCasa("Hotel 5 stele");
		hotel.setNrEtaje(3);
		hotel.setPret(100000);
		System.out.println("Avem in patrimoniu : " + hotel.getTipCasa() + " cu " + hotel.getNrEtaje() + " etaje, care costa " + hotel.getPret()+ " euro." );
		System.out.println("Urmeaza sa construim o " + resedinta.getTipCasa()+ " care va costa "+ resedinta.getPret() + " euro");
		System.out.println("Resedinta va avea un " + garaj.getTipCasa() + ", nr etaje - " + garaj.getNrEtaje() + ", valorand "+ garaj.getPret());
		

	}

}
