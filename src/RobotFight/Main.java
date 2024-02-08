package RobotFight;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //-----> COMBAT ENTRE ROBOT ET HUMAIN

        //CREATION DE 2 OBJETS ROBOT AVEC AFFICHAGE DU NOM A CHAQUE FOIS
        Robot robot1 = new Robot("DROID");
        System.out.println(robot1.afficherNom());
        Robot robot2 = new Robot("DATA");
        System.out.println(robot2.afficherNom());



        //--> LANCEMENT DU COMBAT AVEC 2 ROBOTS ET AFFICHAGE DU VAINQUEUR
       Robot RobotVainqueur = Arena.Fight(robot1, robot2);
       System.out.println("Le vainqueur est  "+RobotVainqueur.afficherNom());

        //-----> COMBAT ENTRE ROBOT ET HUMAIN
        System.out.println("Second combat entre humain et humain");
        System.out.println(" ");

        //CREATION DE 2 OBJETS FIGHTER AVEC AFFICHAGE DU NOM A CHAQUE FOIS
        Fighter John = new Fighter("John", 2);
        Fighter Brad = new Fighter("Brad", 4);
        System.out.println(John.afficherNom());

        //--> LANCEMENT DU COMBAT ENTRE 2 HUMAINS AVEC AFFICHAGE DU VAINQUEUR

        System.out.println(" ");
        System.out.println("le Vainqueur est " +Arena.Fight(John, Brad).afficherNom());


      System.out.println(" ");
        System.out.println("-----> Troisième combat entre humain et Robot <-----");
        System.out.println(" ");

/*
        Robot robot3 = new Robot("FILS");
        System.out.println(robot3.afficherNom());
        System.out.println(robot3.point_De_Vie);

        Fighter Elie = new Fighter("Elie", 5);
        System.out.println("le Vainqueur est " +Arena.Fight(Elie, robot3).afficherNom());
*/
    }
}