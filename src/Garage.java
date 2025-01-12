import java.util.ArrayList;

public class Garage {

    ArrayList<Veicolo> ListaVeicoli = new ArrayList<>();


    public boolean AggiungiVeicolo(Veicolo macchina){
        for(int i=0;i<ListaVeicoli.size();i++){
            if (ListaVeicoli.get(i).getTarga().equals(macchina.getTarga())){
                return false;
            }
        }
        ListaVeicoli.add(macchina);
        return true;
    }

    public void RimuoviVeicolo (String targa){

        /*ListaVeicoli.removeIf(Veicolo -> Veicolo.getTarga().equals(targa)); removeif espressione lambda (si fa prima) */
        for(int i=0;i<ListaVeicoli.size();i++){
            if (ListaVeicoli.get(i).getTarga().equals(targa)){
                ListaVeicoli.remove(i);
                return;
            }
        }
    }

    public double TasseTotali(){
        double totaleTasse=0;
        for(int i=0;i<ListaVeicoli.size();i++){
            totaleTasse+=ListaVeicoli.get(i).CalcolaTassa();
        }
        return totaleTasse;
    }

    

}
