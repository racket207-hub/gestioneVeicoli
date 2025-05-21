/**
 * Classe Moto che implementa l'interfaccia Veicolo coi metodi:
 * -getModello
 * -getAnno
 * -getCC
 * -startMotore
 */
public class Moto implements Veicolo{
    private String modello;
    private int anno;
    private int cc;

    public Moto(String modello, int anno, int cc) {
        this.modello = modello;
        this.anno = anno;
        this.cc = cc;
    }

    /**
     * metodo per accedere all'attributo private cc e di
     * ritornarne il valore
     * @return
     */
    public int getCC(){
        return cc;
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
        System.out.println("Motore acceso: Bruum!");
    }
}
