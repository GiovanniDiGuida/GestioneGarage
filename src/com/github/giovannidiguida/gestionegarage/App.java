package com.github.giovannidiguida.gestionegarage;

import com.github.giovannidiguida.gestionegarage.veicolo.Auto;
import com.github.giovannidiguida.gestionegarage.veicolo.Moto;
import com.github.giovannidiguida.gestionegarage.veicolo.Veicolo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Benvenuto nel com.github.giovannidiguida.gestionegarage.Garage");
        Garage garage = new Garage();


        Moto moto1 = new Moto("Modello Pippo", "Audi", "ABC123", 1900, 3000, 100);
        Moto moto2 = new Moto("Modello Luca", "Idua", "CBA321", 1950, 4000, 100);

        Auto auto1 = new Auto(4, "Modello Catalin", "Dacia", "FRE123", 1998, 100);
        Auto auto2 = new Auto(5, "Modello Giovanni", "Rubare", "IoRubo123", 1995, 100);

        garage.aggiungiVeicolo(moto1);
        garage.aggiungiVeicolo(moto2);
        garage.aggiungiVeicolo(auto1);
        garage.aggiungiVeicolo(auto2);

        for (Veicolo veicolo : garage.tuttiVeicoli()) { /*Metodo più veloce con foreach */
            System.out.println(veicolo.getDescrizione());
        }

        /*garage.mappaVeicoli.forEach(com.github.giovannidiguida.gestionegarage.veicolo.Veicolo-> System.out.println(com.github.giovannidiguida.gestionegarage.veicolo.Veicolo.getDescrizione())); un altro modo per stampare e richiamare */

        /*for (int i=0;i<garage.mappaVeicoli.size();i++){
            System.out.println(garage.mappaVeicoli.get(i).getDescrizione());
        } Metodo classico */

        System.out.println("Le tasse totali sono: " + garage.tasseTotali());
    }
}
