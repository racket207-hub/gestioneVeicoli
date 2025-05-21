import java.io.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int contaVeicoliVecchi(Veicolo[] veicoli, int annoMassimo){
        int veicoliVecchi = 0;
        for (int i = 0; i < veicoli.length; i++) {
            if(veicoli[i].getAnno() <= annoMassimo){
                veicoliVecchi++;
            }
        }
        return veicoliVecchi;
    }
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;

        int tipoVeicolo;
        Veicolo[] v = new Veicolo[3];
        v[0] = new Automobile("500", 2017, 5);
        v[1] = new Moto("Yamaha R1", 2010, 1000);

        int i = 2;
        while (i<v.length) {
            boolean isValid = true;
            do {
                System.out.println("Quale tipo di veicolo vuoi inserire");
                try {
                    input = br.readLine();
                    tipoVeicolo = Integer.parseInt(input);
                    switch (tipoVeicolo) {
                        case 1:
                            //automobile
                            System.out.println("Modello: ");
                            input = br.readLine();
                            System.out.println("Anno: ");
                            input = br.readLine();
                            int anno = Integer.parseInt(input);
                            System.out.println("Porte: ");
                            input = br.readLine();
                            int porte = Integer.parseInt(input);
                            v[i] = new Automobile(input, anno, porte);
                            break;

                        case 2:
                            //moto
                            System.out.println("Modello: ");
                            input = br.readLine();
                            System.out.println("Anno: ");
                            input = br.readLine();
                            anno = Integer.parseInt(input);
                            System.out.println("cc: ");
                            input = br.readLine();
                            int cc = Integer.parseInt(input);
                            v[i] = new Moto(input, anno, cc);
                            break;
                    }
                    i++;
                } catch (IOException e) {
                    isValid = false;
                }
            } while (!isValid);
        }

        for(int j = 0; j < v.length; j++) {
            System.out.println("Modello: " + v[j].getModello() + " Anno: " + v[j].getAnno());
            v[j].startMotore();
        }

        System.out.println(contaVeicoliVecchi(v, 2016));
    }
}