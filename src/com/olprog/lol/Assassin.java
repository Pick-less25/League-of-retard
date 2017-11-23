package com.olprog.lol;

public class Assassin extends Mauvais {
	
	public Assassin(String nom) {
        super(nom);
    }

	@Override
	protected void generation() {
		this.setPoint_de_vie(Assassin.rand(420, 620));
		this.attaque.put("base",Assassin.rand(20, 35));
		this.attaque.put("physique",Assassin.rand(25, 125));
		this.attaque.put("special",Assassin.rand(30, 60));
		this.setType_energie(TypeEnergie.ENERGIE);
		this.setJauge_energie(this.getType_energie().getValeur());
	}
	
}
