Esercizio: Sistema di Gestione di Veicoli
Devi creare un sistema per gestire diversi tipi di veicoli in un garage. Il sistema deve tenere traccia delle informazioni dei veicoli e consentire operazioni specifiche in base al tipo di veicolo.

Requisiti
Crea una classe base com.github.giovannidiguida.gestionegarage.veicolo.Veicolo con:

Attributi: marca, modello, anno, targa.
Un metodo descrizione() che restituisce una stringa con le informazioni del veicolo.
Un metodo astratto calcola_tassa().
Crea classi derivate da com.github.giovannidiguida.gestionegarage.veicolo.Veicolo:

com.github.giovannidiguida.gestionegarage.veicolo.Auto: aggiunge un attributo numero_posti. Implementa il metodo calcola_tassa() in base a un valore fisso + una tassa per ogni posto.
com.github.giovannidiguida.gestionegarage.veicolo.Moto: aggiunge un attributo cilindrata. Implementa il metodo calcola_tassa() in base alla cilindrata.


Crea una classe com.github.giovannidiguida.gestionegarage.Garage per gestire un insieme di veicoli, con:

Un attributo lista_veicoli che memorizza i veicoli.
Un metodo aggiungi_veicolo(veicolo) per aggiungere un veicolo al garage.
Un metodo rimuovi_veicolo(targa) per rimuovere un veicolo usando la targa.
Un metodo calcola_tasse_totali() per calcolare la somma delle tasse di tutti i veicoli.
Gestione delle eccezioni per evitare di aggiungere veicoli con targhe duplicate.
Infine, crea un programma principale che:

Crea almeno due oggetti per ogni tipo di veicolo.
Li aggiunge al garage.
Stampa la descrizione di tutti i veicoli.
Calcola e stampa le tasse totali.
