package com.github.giovannidiguida.gestionegarage.veicolo;

public class Auto extends Veicolo {
    private int numeroPosti;

    public Auto(int NumeroPosti, String modelloInput, String marcaInput, String targaInput, int annoInput, int ChilometraggioInput) {
        super(modelloInput, marcaInput, targaInput, annoInput, ChilometraggioInput);
        numeroPosti = NumeroPosti;
    }

    @Override
    public double calcolaTassa() {
        double tassa = 40 + (numeroPosti * 10);
        return tassa;
    }
}
