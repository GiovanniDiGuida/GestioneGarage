package com.github.giovannidiguida.gestionegarage;

import com.github.giovannidiguida.gestionegarage.exception.TargaVeicoloInesistenteException;
import com.github.giovannidiguida.gestionegarage.exception.VeicoloDuplicatoException;
import com.github.giovannidiguida.gestionegarage.veicolo.Veicolo;

import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

public class Garage {
    //vedo che l'es fatto generare male in python chiede un dizionario, quindi cambiamo in hashmap
    private HashMap<String, Veicolo> mappaVeicoli = new HashMap<>();

    //aggiunta eccezione come richiesto da esercizio, anche se in questo caso si poteva evitare era meglio con il boolean
    public void aggiungiVeicolo(Veicolo veicolo) {
        if (mappaVeicoli.containsKey(veicolo.getTarga())) {
            throw new VeicoloDuplicatoException(veicolo);
        }
        mappaVeicoli.put(veicolo.getTarga(), veicolo);
    }

    public void rimuoviVeicolo(String targa) {
        if (!mappaVeicoli.containsKey(targa)) {
            throw new TargaVeicoloInesistenteException(targa);
        }
        mappaVeicoli.remove(targa);
    }

    public double tasseTotali() {
        double totaleTasse = 0;
        for (int i = 0; i < mappaVeicoli.size(); i++) {
            totaleTasse += mappaVeicoli.get(i).calcolaTassa();
        }
        return totaleTasse;
    }

    public List<Veicolo> tuttiVeicoli() {
        return (List<Veicolo>) mappaVeicoli.values();
    }

    //todo ancora da implementare
    public List<Veicolo> cercaVeicoli(Predicate<Veicolo> filtro) {
        return null;
    }

    //todo ancora da implementare
    public List<Veicolo> veicoliOrdinati() {
        return null;
    }


}
