public abstract class Veicolo implements Comparable<Veicolo> {
    //Mi piace averli separati, ma è irrilevante, in dei contesti però è meglio se si usano annotazioni @Qualcosa
    private String modello;
    private String marca;
    private String targa;
    //Cambio nomi per rispettare la convenzione Java
    private int anno;
    private int chilometraggio;

    //Mi piace avere gli stessi nomi delle variabili d'istanza
    public Veicolo(String modello, String marca, String targa, int anno, int chilometraggio) {
        this.modello = modello;
        this.marca = marca;
        this.targa = targa;
        this.anno = anno;
        this.chilometraggio = chilometraggio;
    }

    //todo gestione errori
    //es. "Auto, Fiat, 500, 2020, AB123CD, 4").
    public static Veicolo daStringa(String t) {
        Veicolo result;

        String[] valori = t.split(",");
        int numeroPosti = Integer.parseInt(valori[5]);
        int anno = Integer.parseInt(valori[3]);
        int chilometraggio = Integer.parseInt(valori[6]);

        if (valori[0].equalsIgnoreCase("auto")) {
            result = new Auto(numeroPosti, valori[2], valori[1], valori[4], anno, chilometraggio);
        } else {
            int cilindrata = Integer.parseInt(valori[7]);
            result = new Moto(valori[2], valori[1], valori[4], anno, cilindrata, chilometraggio);
        }

        return result;
    }

    public abstract double calcolaTassa();

    @Override
    public int compareTo(Veicolo o) {
        return Integer.compare(anno, o.anno);
    }

    public String getDescrizione() {
        return "Modello:" + modello + " Marca: " + marca + " Targa: " + targa + " anno: " + anno + " chilometraggio: " + chilometraggio;
    }

    public String getTarga() {
        return targa;
    }

    public int getChilometraggio() {
        return chilometraggio;
    }

    public void setChilometraggio(int chilometraggio) {
        this.chilometraggio = chilometraggio;
    }
}
