package com.olprog.lol;

public class Necromant extends Mauvais{
	
    public Necromant(String nom) {
        super(nom);
    }

	@Override
	protected void generation() {
        this.setPoint_de_vie(Necromant.rand(350, 450));
        this.attaque.put("base",Necromant.rand(1, 5));
        this.attaque.put("physique",Necromant.rand(25, 45));
        this.attaque.put("special",Necromant.rand(120, 220));
        this.setType_energie(TypeEnergie.MANA);
        this.setJauge_energie(this.getType_energie().getValeur());
		
	}
}
