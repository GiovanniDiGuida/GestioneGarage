package com.github.giovannidiguida.gestionegarage.veicolo;

public class Moto extends Veicolo {
    private int cilindrata;

    public Moto(String modello, String marca, String targa, int anno, int chilometraggio, int cilindrata) {
        super(modello, marca, targa, anno, chilometraggio);
        this.cilindrata = cilindrata;
    }

    @Override
    public double calcolaTassa() {
        return cilindrata * 10;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrata=" + cilindrata +
                ", modello='" + modello + '\'' +
                ", marca='" + marca + '\'' +
                ", anno=" + anno +
                ", chilometraggio=" + chilometraggio +
                ", targa='" + targa + '\'' +
                '}';
    }
}
