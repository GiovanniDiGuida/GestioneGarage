package com.github.giovannidiguida.gestionegarage;

import com.github.giovannidiguida.gestionegarage.exception.TargaVeicoloInesistenteException;
import com.github.giovannidiguida.gestionegarage.exception.VeicoloDuplicatoException;
import com.github.giovannidiguida.gestionegarage.veicolo.Veicolo;

import java.util.ArrayList;
import java.util.Comparator;
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
        for (Veicolo value : mappaVeicoli.values()) {
            totaleTasse += value.calcolaTassa();
        }
        return totaleTasse;
    }

    //probabilmente ti chiedi come mai non fai return diretto dei values?
    //lo faccio perché values non ritorna una copia, ma l'implementazione reale che c'è nella mappa
    //una modifica potrebbe rompere il sistema, come anche no, ma per sicurezza faccio una copia
    public List<Veicolo> tuttiVeicoli() {
        return new ArrayList<>(mappaVeicoli.values());
    }

    public List<Veicolo> cercaVeicoli(Predicate<? super Veicolo> filtro) {
        return mappaVeicoli.values()
                .stream()
                .filter(filtro)
                .toList();
    }

    //todo ancora da implementare
    public List<Veicolo> veicoliOrdinati(Comparator<Veicolo> comparator) {
        return mappaVeicoli.values()
                .stream()
                .sorted(comparator)
                .toList();
    }
}
