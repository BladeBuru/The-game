import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JoueurTest {

    @Test
    public void toStringTest(){
        Joueur j1 = new Joueur("J1");
        assertTrue(j1.toString().equals("J1 ^[60] v[01] (m0p57)"));

    }

}
