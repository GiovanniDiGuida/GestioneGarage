package com.github.giovannidiguida.gestionegarage.veicolo;

public class Auto extends Veicolo {
    private int numeroPosti;

    public Auto(String modello, String marca, String targa, int anno, int chilometraggio, int numeroPosti) {
        super(modello, marca, targa, anno, chilometraggio);
        this.numeroPosti = numeroPosti;
    }

    @Override
    public double calcolaTassa() {
        return 40 + (numeroPosti * 10);
    }
}
