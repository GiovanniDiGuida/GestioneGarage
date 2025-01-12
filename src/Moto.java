public class Moto extends Veicolo {
    private int cilindrata;

    public Moto(String modelloInput, String marcaInput, String targaInput, int annoInput, int cilindrata, int ChilometraggioInput) {
        super(modelloInput, marcaInput, targaInput, annoInput, ChilometraggioInput);
        this.cilindrata = cilindrata;
    }

    @Override
    public double calcolaTassa() {
        double tassaMoto = cilindrata * 10;
        return tassaMoto;
    }
}
