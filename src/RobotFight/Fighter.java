package RobotFight;
import java.util.Random;

public class Fighter extends Robot {
    Random random;

    public Fighter(String nom, long seed){
        super(nom);
        random = new Random(seed);
    }

    @Override
    public String afficherNom(){
        return "Fighter " +this.nom;
    }

@Override
    public void fire(Robot cible) {
        boolean Toucher =  random.nextBoolean();
        if (!Toucher){
            System.out.println(" -+- "+this.nom+" a manqué la cible " +cible.afficherNom());
        }
        else{
            cible.point_De_Vie -=2;
            System.out.println(" --> "+this.nom+" a touché la cible " +cible.afficherNom());
        }

    }



}
