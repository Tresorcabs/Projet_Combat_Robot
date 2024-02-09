package RobotFight;
import org.junit.Test;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
public class RobotTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        //S'exécute avant tout
        System.out.println(" ");
        System.out.println("CECI EST LE TEST UNITAIRE LA CLASS ROBOT !");
        System.out.println(" ");
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
        RobotTest.fire(RobotTest2);
        assertTrue(RobotTest2.point_De_Vie < 10);
        System.out.println("Test de fire (tir) passé !");
    }

    @Test
    public void testIsDead() throws Exception{
        //TEST DE MORT
        Robot RobotTest = new Robot("Elie");
        RobotTest.point_De_Vie = 0;
        assertTrue(RobotTest.isDead());
        System.out.println("Test s'il est mort avec isDead() passé !");
    }

}
