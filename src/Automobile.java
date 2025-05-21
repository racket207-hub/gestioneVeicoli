/**
 * Classe Automobile che implementa l'interfaccia Veicolo coi metodi:
 * -getModello
 * -getAnno
 * getPorte
 * -startMotore
 */
public class Automobile implements Veicolo{
    private String modello;
    private int anno;
    private int porte;

    /**
     * Metodo costruttore della classe Automobile che inizializza
     * gli attibuti String modello, int anno e int porte
     * @param modello
     * @param anno
     * @param porte
     */
    public Automobile(String modello, int anno, int porte) {
        this.modello = modello;
        this.anno = anno;
        this.porte = porte;
    }

    /**
     * metodo per accedere all'attributo private porte e di
     * ritornarne il valore
     * @return
     */
    public int getPorte(){
        return porte;
    }

    /**
     * metodo sovrascritto dell'interfaccia Veicolo che
     * ci permette di accedere all'attributo private
     * modello e di ritornarne il valore
     * @return
     */
    @Override
    public String getModello() {
        return modello;
    }

    /**
     * metodo sovrascritto dell'interfaccia Veicolo che
     * ci permette di accedere all'attributo private
     * anno e di ritornarne il valore
     * @return
     */
    @Override
    public int getAnno() {
        return anno;
    }

    /**
     * metodo sovrasctitto dell'interfaccia Veicolo che
     * ci permette di stampare a video l'accensione del
     * motore
     */
    @Override
    public void startMotore() {
        System.out.println("Motore acceso: Vroom!");
    }
}
