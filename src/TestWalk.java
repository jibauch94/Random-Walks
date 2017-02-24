/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jibba_000
 */
public class TestWalk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 //---------------------------------------------------------------------//
        
        // to run a Random walk with 200 steps in a boundry of 10 use code below
        // you will need to make sure that the system.out.println inBounds method are NOT outcommend
        System.out.println("RandomWalk:");
        RandomWalk walker1 = new RandomWalk(200, 10);
        walker1.walk();
        System.out.println("You took " + walker1.getTakenSteps() + " steps" + "\n");
        
//---------------------------------------------------------------------//
//---------------------------------------------------------------------//

        // to run a drunken walk use code below
        // you will also need to outcomment the System.out.println in the inBounds method in the RandomWalk class
        // the drunk will walk until he falls of the platform,
        // when the drunk falls out of bounds, a new drunk will begin a random walk
        // therefore the drunk can only fall one time, so 10 drunks can give the maximum fall of 10
        
        
        //System.out.println("DrunkenWalk:");
        //DrunkenWalk drunkenWalk = new DrunkenWalk();
        //drunkenWalk.drunkWalk(10);
        
        
//---------------------------------------------------------------------//
//---------------------------------------------------------------------//
        // in order to get the max distance from a walker you need the code below
        // you will get the maxdistance on both the x-line and from the y-line
        // you will need to make sure that the system.out.println the inBounds method are NOT outcommend
        System.out.println("MaxDistance:" + "\n");
        RandomWalk walker2 = new RandomWalk(0, 0, 200, 50);
        walker2.walk();
        System.out.println("x= " + walker2.getX() + "y= " + walker2.getY());
        System.out.println("max x: " + walker2.getMaxDistX() + " max y: " + walker2.getMaxDistY());
        
//---------------------------------------------------------------------//


        
//        for (int i = 0; i < 5; i++) {
//            //walker1.takeStep();
//            walker2.takeStep();
            
        }
    }
    

