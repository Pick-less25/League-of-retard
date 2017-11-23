package com.olprog.lol;

public class JeuxVideoTest {
	
	
	
	
	// TEST JAUGE ENERGIE //
	
	
	public void rageJauge(Personnage p, Integer degats, Integer coups) {
		if (degats > 0 || coups > 0) {
			p.setJauge_energie(p.getJauge_energie() + 5);
		}
	}

	static Integer energiePts;

	public void energieJauge(Personnage p, Integer degats) {
		if (p.getType_energie() == TypeEnergie.ENERGIE) {
			energiePts -= degats;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			energiePts *= (10 / 100) + 1;
		}
	}

	
	
	//** ENTER NEW CHALLENGER //**
	public static void main(String[] args) throws InterruptedException {
					
		
			
		Mage Lux = new Mage("Lux");
		System.out.println(Lux.getNom());
		System.out.println(" Pv : " + Lux.getPoint_de_vie());
		System.out.println("Base atck : " + Lux.attaque.get("base"));
		System.out.println("Special atck : " + Lux.attaque.get("physique"));
		System.out.println("Ultimate power : " + Lux.attaque.get("special"));
		System.out.println("---------------------------------------------");

		// Assassin Zeratul = new Assassin("Zeratul");
		// System.out.println(Zeratul.getNom());
		// System.out.println(" Pv : " +Zeratul.getPoint_de_vie());
		// System.out.println("Base atck : " + Zeratul.attaque.get("base"));
		// System.out.println("Special atck : " +Zeratul.attaque.get("physique"));
		// System.out.println("Ultimate power : "+Zeratul.attaque.get("special"));
		// System.out.println("---------------------------------------------");
		//
		// Archer Valla = new Archer("Valla");
		// System.out.println(Valla.getNom());
		// System.out.println(" Pv : " +Valla.getPoint_de_vie());
		// System.out.println("Base atck : " +Valla.attaque.get("base"));
		// System.out.println("Special atck : " +Valla.attaque.get("physique"));
		// System.out.println("Ultimate power : "+Valla.attaque.get("special"));
		// System.out.println("---------------------------------------------");
		//
		// Guerrier Durotan = new Guerrier("Durotan");
		// System.out.println(Durotan.getNom());
		// System.out.println(" Pv : " +Durotan.getPoint_de_vie());
		// System.out.println("Base atck : " + Durotan.attaque.get("base"));
		// System.out.println("Special atck : "+Durotan.attaque.get("physique"));
		// System.out.println("Ultimate power : "+Durotan.attaque.get("special"));
		// System.out.println("---------------------------------------------");
		//
		//
		Necromant KelThuz = new Necromant("KelTuzad");
		System.out.println(KelThuz.getNom());
		System.out.println(" Pv : " + KelThuz.getPoint_de_vie());
		System.out.println("Base atck : " + KelThuz.attaque.get("base"));
		System.out.println("Special atck : " + KelThuz.attaque.get("physique"));
		System.out.println("Ultimate power : " + KelThuz.attaque.get("special"));
		System.out.println("---------------------------------------------");
		
		
		
		//*End//*
		
		
		
		//LET'S BEGIN THE FIGHT//

		while (Lux.getPoint_de_vie() > 0 && KelThuz.getPoint_de_vie() > 0) {
			Lux.setPoint_de_vie(Lux.getPoint_de_vie() - KelThuz.attaque.get("base"));
			KelThuz.setPoint_de_vie(KelThuz.getPoint_de_vie() - Lux.attaque.get("base"));
			Thread.sleep(100);
			System.out.println(" Lux : " + Lux.getPoint_de_vie() + (" Kt : " + KelThuz.getPoint_de_vie()));
		}
		if (Lux.getPoint_de_vie() <= 0) {
			System.out.println("KelThuz win");

		} else if (KelThuz.getPoint_de_vie() <= 0) {
			System.out.println("Lux win");
		}

	}
}
