package RobotFight;

public class Arena {
    //METHODE QUI GERE LE COMBAT ENTRE ROBOT ET ROBOT
    public static Robot Fight(Robot robot1, Robot robot2){
        while (!robot1.isDead() && !robot2.isDead()){
            robot1.fire(robot2);
            if (!robot2.isDead()){
                robot2.fire(robot1);
            }
        }
        if (robot1.isDead()){
            System.out.println(("-> "+robot1.afficherNom() + " est mort !"));
            return robot2;
        }
        else{
            System.out.println(("-> "+robot2.afficherNom() + " est mort !"));
            return robot1;
        }

    }





/*
    public static Robot Fight(Fighter Humain1, Robot robot2){

        while (!Humain1.isDead() && !robot2.isDead()){
            Humain1.fireH(robot2);
            if (!robot2.isDead()){
                robot2.fireR(Humain1);
            }
        }
        if (Humain1.isDead()){
            System.out.println(("-> "+Humain1.afficherNom() + " est mort !"));
            System.out.println("------>[ le Vainqueur est " +robot2.afficherNom()+"] <-------");

            return robot2;
        }
        else{
            System.out.println(("-> "+robot2.afficherNom() + " est mort !"));
            System.out.println("------>[ le Vainqueur est " +Humain1.afficherNom()+"] <-------");
        return Humain1;
        }

    }
    */


    }

