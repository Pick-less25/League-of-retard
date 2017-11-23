package com.olprog.lol;

import java.lang.reflect.Type;

public class Mage extends Bon {

    public Mage(String nom) {
        super(nom);
    }
    
	@Override
	public void generation() {
		this.setPoint_de_vie(Mage.rand(300, 500));
		this.attaque.put("base",Mage.rand(1, 5));
		this.attaque.put("physique",Mage.rand(20, 50));
		this.attaque.put("special",Mage.rand(100,200));
		this.setType_energie(TypeEnergie.MANA);
        this.setJauge_energie(this.getType_energie().getValeur());
	}
	

}
