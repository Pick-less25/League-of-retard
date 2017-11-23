package com.olprog.lol;

public enum TypeEnergie {
    RAGE(0), MANA(300), ENERGIE(100);

    private Integer valeur;

    TypeEnergie(Integer val){
        this.valeur = val;
    }

    public Integer getValeur() {
        return valeur;
    }

    public Integer pertePts(Integer pts, Integer percent){
        if (this == RAGE){
            return pts * (((percent /2 ) / 100) + 1);
        }
        return pts * (percent / 100 + 1);
    }


}
