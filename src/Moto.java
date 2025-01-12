public class Moto extends Veicolo {

    int cilindrata;

    public Moto(String modelloInput, String marcaInput, String targaInput, int annoInput, int cilindrata, int ChilometraggioInput) {
        super(modelloInput, marcaInput, targaInput, annoInput, ChilometraggioInput);
        this.cilindrata = cilindrata;
    }

    @Override
    public double CalcolaTassa() {
        double tassaMoto=cilindrata*10;
        return tassaMoto;
    }


    
}
