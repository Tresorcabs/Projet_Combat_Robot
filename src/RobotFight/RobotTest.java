package RobotFight;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
public class RobotTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        //
        System.out.println("Message affiché avant tous les autres !");
    }

    @AfterClass
    public static void setUpAfterClass() throws Exception{
        //
        System.out.println("Message affiché après tous les autres !");
    }

    @Before
    public void tearBefore() throws Exception{
        //
        System.out.println("Message affiché avant l'exécution de chaque composant !");
    }

    @After
    public void tearAfter() throws Exception{
        //
        System.out.println("Message affiché après l'exécution de chaque composant  !");
    }

    @Test
    public void testCreationRobot() throws Exception{
        //TEST DE CREATION D'UN ROBOT
        Robot RobotTest = new Robot("Elie"); //création du robot Robot 1
        assertNotNull(RobotTest);   //Vérification qe RobotTest n'est pas nul
        assertEquals("Elie", RobotTest.nom);
        assertEquals(10, RobotTest.point_De_Vie);
        System.out.println("Test de Création passé !");
    }

    @Test
    public void testRobotFire() throws Exception{
        //TEST DE TIR DU ROBOT 1 SUR LE 2
        Robot RobotTest = new Robot("Elie");
        Robot RobotTest2 = new Robot("Fred");
        assertNotNull(RobotTest);
        assertNotNull(RobotTest2);
        RobotTest.fire(RobotTest2);
        assertTrue(RobotTest2.point_De_Vie < 10);
        System.out.println("Test de fire (tir) passé !");
    }

    @Test
    public void testIsDead() throws Exception{
        Robot RobotTest = new Robot("Elie");
        RobotTest.point_De_Vie = 0;
        assertTrue(RobotTest.isDead());
        System.out.println("Test s'il est mort avec isDead() passé !");
    }

}
