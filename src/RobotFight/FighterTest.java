package RobotFight;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
public class FighterTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        //
        System.out.println("Message affiché avant tous les autres !");
    }

    @AfterClass
    public static void setUpAfterClass() throws Exception{
        //
        System.out.println("Message affiché avant tous les autres !");
    }

    @Before
    public void tearBefore() throws Exception{
        //
        System.out.println("Message affiché avant tous les autres !");
    }

    @After
    public static void tearAfter() throws Exception{
        //
        System.out.println("Message affiché avant tous les autres !");
    }

    @Test
    public void testCreationFighter() throws Exception{
        //TEST DE CREATION D'UN FIGHTER
        Fighter fighterTest = new Fighter("LAURIAN", 10); //création du fighter fighterTest
        assertNotNull(fighterTest);   //Vérification qe fighterTest n'est pas nul
        assertEquals("LAURIAN", fighterTest.nom);
        assertEquals(10, fighterTest.point_De_Vie);
        System.out.println("Test de Création passé !");
    }

   @Test
    public void testFighterFire() throws Exception{
       //TEST DE TIR DU ROBOT 1 SUR LE 2
        Fighter fighterTest = new Fighter("LAURIAN", 10);
        Fighter fighterTest2 = new Fighter("FRANCK", 10);
        assertNotNull(fighterTest);
        assertNotNull(fighterTest2);
        fighterTest.fire(fighterTest2);
        assertTrue(fighterTest2.point_De_Vie < 10);
        System.out.println("MTest de fire (tir) passé !");
    }

}
