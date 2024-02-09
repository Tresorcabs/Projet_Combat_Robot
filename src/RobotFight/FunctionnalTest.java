package RobotFight;

import org.junit.*;

import static org.junit.Assert.assertTrue;

public class FunctionnalTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        //S'exécute avant tout
        System.out.println(" ");
        System.out.println("CE PROGRAMME VA EFFECTUER UN TEST FONCTIONNEL SUR LE PROGRAMME!");
        System.out.println(" ");
    }

    @Test
    public void testFight() throws Exception{
        //TEST DU COMBAT ENTRE ROBOT ET ROBOT

        Robot RobotTest = new Robot("Elie");
        Robot RobotTest2 = new Robot("Fred");
       Robot Gagnant = Arena.Fight(RobotTest, RobotTest2);
        System.out.println(" --***--**--*- Le Gagnant est le "+Gagnant.afficherNom());
    }
}
