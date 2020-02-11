package main;

public class TestAnimal {

	public static void main(String[] args) {
		Animal dog = new Animal("puppy","black",1);
		Animal cat = new Animal("kitten");
		Animal horse = new Animal();
		
		System.out.println(" First animal is a " + dog.getTipAnimal() + ", " + dog.getCuloare() + " color ," + " and "+ dog.getVarsta() + " years old.");
		System.out.println();
		
		cat.setCuloare("yellow");
		System.out.println(" Second animal is a " + cat.getTipAnimal());
		System.out.println(" Second animal has " + cat.getCuloare() + " color");
		System.out.println();
		
		System.out.println(" First animal is a " + horse.getTipAnimal() + ", " + horse.getCuloare() + " color ," + " and "+ horse.getVarsta() + " years old.");
		horse.setTipAnimal("pony");
		horse.setCuloare("brown");
		horse.setVarsta(4);
		System.out.println(" First animal is a " + horse.getTipAnimal() + ", " + horse.getCuloare() + " color ," + " and "+ horse.getVarsta() + " years old.");
		
	}

}
