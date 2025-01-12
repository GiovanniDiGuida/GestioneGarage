package com.github.giovannidiguida.gestionegarage.veicolo;

public abstract class Veicolo implements Comparable<Veicolo> {
    //Mi piace averli separati, ma è irrilevante, in dei contesti però è meglio se si usano annotazioni @Qualcosa
    protected String modello;
    protected String marca;
    protected String targa;
    //Cambio nomi per rispettare la convenzione Java
    protected int anno;
    protected int chilometraggio;

    //Mi piace avere gli stessi nomi delle variabili d'istanza
    public Veicolo(String modello, String marca, String targa, int anno, int chilometraggio) {
        this.modello = modello;
        this.marca = marca;
        this.targa = targa;
        this.anno = anno;
        this.chilometraggio = chilometraggio;
    }

    //Deciso di evitare direttamente solo un eventuale crash. Non è specificato nell'es di aggiungere altre eccezioni, ma poteva starci bene nel caso una IllegalArgumentException
    //Formato auto "Tipo, Modello, Marca, Targa, Anno, Chilometraggio, Posti"
    //Formato auto "Tipo, Modello, Marca, Targa, Anno, Chilometraggio, Cilindrata"
    public static Veicolo daStringa(String t) {
        Veicolo result = null;

        try {
            String[] valori = t.split(",");
            String modello = valori[1].trim();
            String marca = valori[2].trim();
            String targa = valori[3].trim();
            int anno = Integer.parseInt(valori[4].trim());
            int chilometraggio = Integer.parseInt(valori[5].trim());
            int postiCilindrata = Integer.parseInt(valori[6].trim());

            if (valori[0].equalsIgnoreCase("auto")) {
                result = new Auto(modello, marca, targa, anno, chilometraggio, postiCilindrata);
            } else if (valori[1].equalsIgnoreCase("moto")) {
                result = new Moto(modello, marca, targa, anno, chilometraggio, postiCilindrata);
            }
        } catch (NumberFormatException ignored) {
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
