/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jibba_000
 */
//This class simulates a drunk walker.
// the drunk walks randomly from the RandomWalk class which means the drunk walks until the drunk reaches the maximum steps or until the drunk is out of bounds
// when the drunk is finished walking a new drunk will start a random walk, the rules are the same for every drunk.
// they will walk until they reach their maxmimum steps or until they are out of bounds.
// you run the drunk walk from main class TestWalk
// note that only the drunk must walk, walker1 and walker 2 must be outcommend,
// like all system.out.println must be outcommend in the inBounds method in RandomWalk
public class DrunkenWalk {
    
    public DrunkenWalk(){
    }
    
    public void drunkWalk(int drunks){
        RandomWalk[] drunkList;
        
        drunkList = new RandomWalk[drunks];
        int falls = 0;
        
        for (int i = 0; i < drunkList.length; i++) {
            drunkList[i] = new RandomWalk(200, 10);
            drunkList[i].walk();
            
            if (!drunkList[i].inBounds()){
                System.out.println("Out of bounds mate!! steps: " + drunkList[i].getTakenSteps());
                falls++;
            }
        }
        System.out.println("falls: " + falls);   
    }
    
}
