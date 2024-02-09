package RobotFight;
import java.util.Random;

// CLASSE FIGHTER QUI HERITE DE ROBOT
public class Fighter extends Robot {
    //Objet random
    Random random;
    //Constructeur de Fighter
    public Fighter(String nom, long seed){
        super(nom);
        random = new Random(seed);
    }

    //Cette méthode fait un override du supertype correspondant
    @Override
    public String afficherNom(){
        return "Fighter " +this.nom;
    }

    //Cette méthode fait un override du supertype correspondant en affichant ses propres données
@Override
    public void fire(Robot cible) {
        boolean Toucher =  random.nextBoolean(); //Va récupérer la valeur que va retourner le boolean random
        if (!Toucher){ //if false.....
            System.out.println(" -+- "+this.nom+" a manqué la cible " +cible.afficherNom());
        }
        else{ //if true.....
            cible.point_De_Vie -=2;
            System.out.println(" --> "+this.nom+" a touché la cible " +cible.afficherNom());
        }

    }



}
