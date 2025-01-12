public abstract class Veicolo {

    private String modello, marca, targa;
    private int Anno;
    protected int chilometraggio;

    public Veicolo (String modelloInput,String marcaInput,String targaInput,int annoInput, int ChilometraggioInput){

        modello=modelloInput;
        marca=marcaInput;
        targa=targaInput;
        Anno=annoInput;
        chilometraggio=ChilometraggioInput;

    }

    public String getDescrizione(){

        return "Modello:" + modello + " Marca: " + marca + " Targa: " + targa + " Anno: "+ Anno;
    }

    public abstract double CalcolaTassa();

    public String getTarga(){

        return targa;
    }

    public int getChilometraggio(){
        return chilometraggio;
    }

    public  void setChilometraggio(int Chilomentri){
        
        if (Chilomentri <= 0) {
            System.out.println("Devi mettere chilometri positivi");
        }

        chilometraggio=Chilomentri;
        
    }


    public void ConfrontoCronologico(Veicolo veicolo){

        if (Anno > veicolo.Anno) {
            System.out.println("Il veicolo inserito è più giovane");
        }
    }





}
