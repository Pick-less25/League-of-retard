package com.olprog.lol;

public class Guerrier extends Bon {

    public Guerrier(String nom) {
        super(nom);
    }

    @Override
    protected void generation() {
        this.setPoint_de_vie(Guerrier.rand(500, 1000));
        this.attaque.put("base",Guerrier.rand(15, 30) );
        this.attaque.put("physique",Guerrier.rand(80, 120) );
        this.attaque.put("special",Guerrier.rand(30, 60) );
        this.setType_energie(TypeEnergie.RAGE);
        this.setJauge_energie(this.getType_energie().getValeur());

    }
}
