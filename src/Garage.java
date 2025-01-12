import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

public class Garage {
    //vedo che l'es fatto generare male in python chiede un dizionario, quindi cambiamo in hashmap
    private HashMap<String, Veicolo> mappaVeicoli = new HashMap<>();

    // todo aggiungere eccezioni
    public boolean aggiungiVeicolo(Veicolo veicolo) {
        if (mappaVeicoli.containsKey(veicolo.getTarga())) {
            return false;
        }

        mappaVeicoli.put(veicolo.getTarga(), veicolo);
        return true;
    }

    public void rimuoviVeicolo(String targa) {
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
