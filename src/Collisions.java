
import com.sun.org.apache.xpath.internal.axes.WalkerFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jibba_000
 */
public class Collisions {

    /**
     * @param args the command line arguments
     */
    // the collisionwalker will print out how many times 2 walkers have samePosition for a given number of steps
    // note that the walkers will only take steps as long they both are inBounds
    // collision works in the same way as drunkenwalk, GAME OVER when you walk out of bounds
    // if one walker goes out of bounds the simulation will stop
    // to run the collision walker, all system.out.println must be outcommend in the inBounds method int the RandomWalk class
    public static void main(String[] args) {
        int steps = 2_000_000;
        int boundry = 100_000;
        RandomWalk collisionWalker1 = new RandomWalk(0, -1, steps, boundry);
        RandomWalk collisionWalker2 = new RandomWalk(0, 1, steps, boundry);
        int countOfCollisions = 0;        
        
        while(collisionWalker1.getTakenSteps() < steps && collisionWalker2.getTakenSteps() < steps && collisionWalker1.inBounds() && collisionWalker2.inBounds()){
            collisionWalker1.takeStep();
            collisionWalker2.takeStep();
            
            if(samePosition(collisionWalker1, collisionWalker2)){
                System.out.println("w1 x punkt: " + collisionWalker1.getX() + "  w1 y punkt: " + collisionWalker1.getY());
                System.out.println("w2 x punkt: " + collisionWalker2.getX() + "  w2 y punkt: " + collisionWalker2.getY());
                countOfCollisions++;
                System.out.println("Number of collisions: " + countOfCollisions + "  takensteps: " + collisionWalker1.getTakenSteps());
            }
        }
        System.out.println("Total taken steps: " + collisionWalker1.getTakenSteps());
    }
    
    public static boolean samePosition(RandomWalk w1, RandomWalk w2){
        if (w1.getX() == w2.getX() && w1.getY() == w2.getY()){
            return true;
        }
        return false;
    }
    
    
}
