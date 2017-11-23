package com.olprog.lol;

public class Archer extends Bon{
    public Archer(String nom) {
        super(nom);
    }


	@Override
	protected void generation() {
        this.setPoint_de_vie(Archer.rand(400, 600));
        this.attaque.put("base",Archer.rand(10, 25));
        this.attaque.put("physique",Archer.rand(100, 200));
        this.attaque.put("special",Archer.rand(60, 100));
        this.setType_energie(TypeEnergie.ENERGIE);
        this.setJauge_energie(this.getType_energie().getValeur());
		
	}}
