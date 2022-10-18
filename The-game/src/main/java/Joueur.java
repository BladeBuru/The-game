
import java.util.ArrayList;

public class Joueur {
    ArrayList<Integer> carteEnMain;
    ArrayList<Integer> pioche ;
    String nom;
    Integer ascendant;
    Integer descendant;

    public void Joueur(String nom){
        this.nom = nom;
        this.carteEnMain = new ArrayList<Integer>(6);
        this.pioche =  new ArrayList<Integer>(58);
        this.ascendant = 1;
        this.descendant = 60;
        for (int i = 2; i < 59; i++) {
            this.pioche.add(i);
        }
    }
}