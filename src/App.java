public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Benvenuto nel Garage");

        Garage garage1 = new Garage();



        Moto moto1 = new Moto("Modello Pippo", "Audi", "ABC123", 1900, 3000,100);
        Moto moto2 = new Moto("Modello Luca", "Idua", "CBA321", 1950, 4000,100);

        Auto auto1 =new Auto(4, "Modello Catalin", "Dacia", "FRE123", 1998,100);
        Auto auto2 =new Auto(5, "Modello Giovanni", "Rubare", "IoRubo123", 1995,100);

        garage1.AggiungiVeicolo(moto1);
        garage1.AggiungiVeicolo(moto2);
        garage1.AggiungiVeicolo(auto1);
        garage1.AggiungiVeicolo(auto2);

        for (Veicolo string : garage1.ListaVeicoli) { /*Metodo più veloce con foreach */
            System.out.println(string.getDescrizione());
        }

        /*garage1.ListaVeicoli.forEach(Veicolo-> System.out.println(Veicolo.getDescrizione())); un altro modo per stampare e richiamare */

        /*for (int i=0;i<garage1.ListaVeicoli.size();i++){
            System.out.println(garage1.ListaVeicoli.get(i).getDescrizione());
        } Metodo classico */

        System.out.println("Le tasse totali sono: "+garage1.TasseTotali());
    }
}
