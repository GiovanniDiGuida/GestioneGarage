public class Auto extends Veicolo {
    
    int numero_posti;

    public Auto(int NumeroPosti,String modelloInput,String marcaInput,String targaInput,int annoInput, int ChilometraggioInput) {
        super(modelloInput,marcaInput,targaInput,annoInput,ChilometraggioInput);
        numero_posti=NumeroPosti;

    }

    @Override
    public double CalcolaTassa() {
        double tassa= 40 +(numero_posti*10);
        return tassa;
    }
}
