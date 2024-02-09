package RobotFight;
import org.junit.Test;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
public class FighterTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        //S'exécute avant tout
        System.out.println(" ");
        System.out.println("CECI EST LE TEST UNITAIRE LA CLASS FIGHTER !");
        System.out.println(" ");
    }

    @Test
    public void testCreationFighter() throws Exception{
        //TEST DE CREATION D'UN FIGHTER
        Fighter fighterTest = new Fighter("LAURIAN", 10);      //création du fighter fighterTest
        assertNotNull(fighterTest);          //Vérification qe fighterTest n'est pas nul
        assertEquals("LAURIAN", fighterTest.nom);
        assertEquals(10, fighterTest.point_De_Vie);
        System.out.println("Test de Création passé !");
    }

   @Test
    public void testFighterFire() throws Exception{
       //TEST DE TIR DU HUMAIN 1 SUR LE 2
        Fighter fighterTest = new Fighter("LAURIAN", 10);      //Humain 1
        Fighter fighterTest2 = new Fighter("FRANCK", 10);      //Humain 2
        assertNotNull(fighterTest);        //On vérifie que l'Humain 1 n'est pas Null
        assertNotNull(fighterTest2);       //On vérifie que l'Humain' 2 n'est pas Null
        fighterTest.fire(fighterTest2);       //On exécute la méthode Fire
        assertTrue(fighterTest2.point_De_Vie < 10);       //On vérifie si l'Humain' cible a reçu un dégât
        System.out.println("MTest de fire (tir) passé !");        //On précise juste que le test s'est bien déroulé

       //NB : si assert détecte une erreur, il arrête l'exécution à ce niveau là
    }

}
