package com.github.giovannidiguida.gestionegarage;

import com.github.giovannidiguida.gestionegarage.veicolo.Auto;
import com.github.giovannidiguida.gestionegarage.veicolo.Moto;
import com.github.giovannidiguida.gestionegarage.veicolo.Veicolo;

import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Benvenuto nel Garage");

        Garage<Veicolo> garageMisto = new Garage<>();
        garageMisto.aggiungiVeicolo(new Moto("Modello Pippo", "Audi", "ABC123", 1900, 3000, 800));
        garageMisto.aggiungiVeicolo(new Moto("Modello Luca", "Idua", "CBA321", 1950, 4000, 100));
        garageMisto.aggiungiVeicolo(new Moto("Modello Bimbi", "Peppe", "Chicco", 2012, 4000, 610));
        garageMisto.aggiungiVeicolo(new Auto("Modello Catalin", "Dacia", "FRE123", 1998, 100, 4));
        garageMisto.aggiungiVeicolo(new Auto("Modello Giovanni", "Rubare", "IoRubo123", 1995, 100, 5));

        /*
        Per creare garage specifici solo moto o auto
        Garage<Moto> garageMoto = new Garage<>();
        Garage<Auto> garageAuto = new Garage<>();
         */

        //potevo usare anche il metodo garage.veicoliOrdinati, non lo uso solo per mostrare l'implementazione del Comparable<Veicolo>
        System.out.println("\nOrdinati per anno");
        List<Veicolo> ordinatiPerAnno = garageMisto.tuttiVeicoli();
        Collections.sort(ordinatiPerAnno);
        ordinatiPerAnno.forEach(System.out::println);

        System.out.println("\nCerco moto con cilindrata maggiore di 600");
        garageMisto.cercaVeicoli(
                veicolo -> veicolo instanceof Moto && ((Moto)veicolo).getCilindrata() > 600
        ).forEach(System.out::println);

        System.out.println("\nLe tasse totali sono: " + garageMisto.tasseTotali());
    }
}
