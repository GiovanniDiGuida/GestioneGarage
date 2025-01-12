package com.github.giovannidiguida.gestionegarage.exception;

import com.github.giovannidiguida.gestionegarage.veicolo.Veicolo;

public class VeicoloDuplicatoException extends RuntimeException {
    public VeicoloDuplicatoException(Veicolo veicolo) {
        super("Veicolo targato " + veicolo.getTarga() + " già presente");
    }
}
