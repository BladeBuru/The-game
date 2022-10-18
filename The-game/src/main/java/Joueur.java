
import java.util.ArrayList;
import java.util.Collections;

public class Joueur {
    private static final int CARTE_EN_MAIN = 6;
    private ArrayList<Integer> carteEnMain;
    private ArrayList<Integer> pioche ;
    private String nom;
    private Integer ascendant;
    private Integer descendant;

    public Joueur(String nom){
        this.nom = nom;
        this.carteEnMain = new ArrayList<Integer>(CARTE_EN_MAIN);
        this.pioche =  new ArrayList<Integer>(58);
        this.ascendant = 1;
        this.descendant = 60;
        for (int i = 2; i < 60; i++) {
            this.pioche.add(i);
        }
        Collections.shuffle(this.pioche);
        this.piocher(CARTE_EN_MAIN);
    }

    public  void piocher(Joueur this, int i) {
        for (int l = 0; l < i && this.carteEnMain.size()<=CARTE_EN_MAIN  ; l++) {
            this.carteEnMain.add(this.pioche.get(0));
            this.pioche.remove(0) ;
        }
        Collections.sort(this.carteEnMain);
    }
    @Override
    public String toString() {
        return this.nom +
                " ^[" + String.format("%02d",this.descendant) + "] " +
                "v[" + String.format("%02d",this.ascendant) + "]" +
                " (m" + this.carteEnMain.size()+ "p" + this.pioche.size() + ")\n" + carteEnMain;
    }
}