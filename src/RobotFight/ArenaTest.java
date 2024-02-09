package RobotFight;

import org.junit.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class ArenaTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        //S'exécute avant tout
        System.out.println(" ");
        System.out.println("CECI EST LE TEST UNITAIRE LA CLASS ARENA !");
        System.out.println(" ");
    }


    @Test
    public void testFight() throws Exception{
        //TEST DE COMBAT ENTRE ROBOT ET ROBOT
        Robot RobotTest = new Robot("Elie");
        Robot RobotTest2 = new Robot("Fred");
        Arena.Fight(RobotTest, RobotTest2);
        assertTrue(RobotTest2.isDead());
        System.out.println("Test de Création passé !");
    }

}
