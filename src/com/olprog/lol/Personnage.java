package com.olprog.lol;

import java.util.HashMap;
import java.util.Random;

public abstract class Personnage {
    private String nom;
    private Integer point_de_vie;
    protected HashMap<String, Integer> attaque = new HashMap<>();
    private TypeEnergie type_energie;
    protected  Integer jauge_energie;
    private static Random rand = new Random();


    public Personnage(String nom) {
        this.nom = nom;
        generation();
    }

    protected abstract void generation();

    protected static Integer rand(Integer min, Integer max) {
        return rand.nextInt(max - min + 1) + min;
    }

    public Integer getJauge_energie() {
        return jauge_energie;
    }

    public String getNom() {
        return nom;
    }

    public void setJauge_energie(Integer jauge_energie) {
        this.jauge_energie = jauge_energie;
    }

    public HashMap<String, Integer> getAttaque() {
        return attaque;
    }

    public void setAttaque(HashMap<String, Integer> attaque) {
        this.attaque = attaque;
    }

    /**
     * @return the point_de_vie
     */
    public Integer getPoint_de_vie() {
        return point_de_vie;
    }


    /**
     * @param type_energie the type_energie to set
     */
    public void setType_energie(TypeEnergie type_energie) {
        this.type_energie = type_energie;
    }

    public TypeEnergie getType_energie() {
        return type_energie;
    }

    public void setPoint_de_vie(Integer point_de_vie) {
        this.point_de_vie = point_de_vie;
    }
}