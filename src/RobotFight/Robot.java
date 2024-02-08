package RobotFight;

import java.util.Random;

public  class Robot {
    public String nom;
    public int point_De_Vie;
    public Robot(String nom){
       this.nom = nom;
       this.point_De_Vie = 10;
    }

    public String afficherNom(){
        return "Robot " +nom;
    }
    public String afficherNomSeul(){
        return nom;
    }

    public Boolean isDead(){
        if (this.point_De_Vie == 0){
            return true;
        }
        else {
            return false;
        }
    }
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
