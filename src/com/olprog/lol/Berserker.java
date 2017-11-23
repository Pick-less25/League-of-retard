package com.olprog.lol;

public class Berserker extends Mauvais{
	public Berserker(String nom) {
        super(nom);
    }

	@Override
	protected void generation() {
		this.setPoint_de_vie(Berserker.rand(550, 850));
		this.attaque.put("base",Berserker.rand(15, 30));
		this.attaque.put("physque",Berserker.rand(90, 135));
		this.attaque.put("special",Berserker.rand(20, 40));
        this.setType_energie(TypeEnergie.RAGE);
        this.setJauge_energie(this.getType_energie().getValeur());
		
	}
}
