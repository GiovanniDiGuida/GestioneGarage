package com.github.giovannidiguida.gestionegarage.exception;

public class TargaVeicoloInesistenteException extends RuntimeException {
    public TargaVeicoloInesistenteException(String targa) {
        super("Veicolor targato " + targa + " inesistente");
    }
}
