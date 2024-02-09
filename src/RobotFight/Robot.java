package RobotFight;

import java.util.Random;

public  class Robot {
    //CHAMPS DE LA CLASSE
    public String nom;
    public int point_De_Vie;

    //CONSTRUCTEUR....
    public Robot(String nom){
       this.nom = nom;
       this.point_De_Vie = 10;
    }
    //METHODE QUI AFFICHE Robot SUIVI DU NOM DU ROBOT
    public String afficherNom(){
        return "Robot " +nom;
    }

    // METHODE BOOLEAN QUI PERMET DE SAVOIR SUI oui UN PARTICIPANT EST MORT OU non
    public Boolean isDead(){
        if (this.point_De_Vie == 0){
            return true;
        }
        else {
            return false;
        }
    }

    //METHODE QUI VA GERER L'ACTION QUI SE PRODUIT LORSQU'UN PARTICIPANT TIRE
    public void fire(Robot cible){
        cible.point_De_Vie -= 2;
        System.out.println( cible.nom+ " a été touché par le Robot " +this.nom+ " !");
        System.out.println(this.nom+ " : "+this.point_De_Vie +" "+cible.nom+ " : "+cible.point_De_Vie);
    }

   /* public void fireH(Robot cible){
        cible.point_De_Vie -= 2;
        System.out.println( cible.nom+ " a été touché par le Robot " +this.nom+ " !");
        System.out.println(cible.nom+ " : "+cible.point_De_Vie);
    }
    public void fireR(Fighter cible) {
        Random random = new Random();
        boolean Toucher = random.nextBoolean();
        if (!Toucher) {
            System.out.println(" -+- " + this.nom + " a manqué la cible " + cible.afficherNom());
        } else {
            cible.point_De_Vie -= 2;
            System.out.println(" --> " + this.nom + " a touché la cible " + cible.afficherNom());
        }
    }*/

}
