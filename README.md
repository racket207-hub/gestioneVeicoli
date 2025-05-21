**Gestione Veicoli**  
Creare un programma per la gestione e catalogazione di veicoli.

---

**Sezione 1: Interfaccia e Classi (3 punti)**
1. Crea un'interfaccia `Veicolo` con:
    - Metodi:  
      `String getModello();`  
      `int getAnno();`  
      `void startMotore();`

2. Crea due classi che implementano `Veicolo`:
    - **Automobile**:
        - Attributi: `modello`, `anno`, `porte` (int)
        - Costruttore che inizializza tutti gli attributi.
        - Implementa `startMotore()` per stampare "🚗 Motore acceso: Vroom!".

    - **Moto**:
        - Attributi: `modello`, `anno`, `cilindrata` (int, in cc)
        - Costruttore che inizializza tutti gli attributi.
        - Implementa `startMotore()` per stampare "🏍️ Motore acceso: Brrrum!".

---

**Sezione 2: Polimorfismo (2 punti)**
3. Nel `main`:
    - Crea un array di `Veicolo` e aggiungi almeno:
        - Un'automobile: modello "Fiat 500", anno 2020, porte 5.
        - Una moto: modello "Yamaha R1", anno 2021, cilindrata 998.

---

**Sezione 3: Input/Output (3 punti)**
4. Modifica il `main` per:
    - Chiedere all'utente quanti veicoli inserire.
    - Per ogni veicolo:
        - Tipo (1=Automobile, 2=Moto).
        - Modello, anno, e attributo specifico (porte o cilindrata).
    - Salva i veicoli in un array.

**Esempio di input**:
```
Quanti veicoli? 1  
Tipo (1=Automobile, 2=Moto): 2  
Modello: Ducati Panigale  
Anno: 2022  
Cilindrata: 1103  
```

---

**Sezione 4: Funzioni e Array (1 punto)**
5. Crea un metodo statico:
   ```java
   public static int contaVeicoliVecchi(Veicolo[] veicoli, int annoMassimo); 
   ```  
   Restituisce il numero di veicoli con anno ≤ annoMassimo.

---

**Sezione 5: Polimorfismo Avanzato (1 punto)**
6. Nel `main`, dopo aver popolato l'array:
    - Stampa per ogni veicolo:
      ```
      Modello: [modello], Anno: [anno]  
      [Messaggio motore]  
      ```  
   Usa `startMotore()` in modo polimorfo.

**Esempio di output**:
```
Modello: Ducati Panigale, Anno: 2022  
🏍️ Motore acceso: Brrrum!  
```

---

**Bonus: Gestione Errori (1 punto)**
7. Gestisci input non validi (es. lettere invece di numeri per anno o cilindrata).  
   Esempio:
   ```
   Inserisci cilindrata: mille  
   Errore: Inserisci un numero valido!  
   ```
---