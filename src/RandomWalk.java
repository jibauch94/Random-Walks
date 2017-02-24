
import java.time.temporal.TemporalAdjusters;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jibba_000
 */
// this class simulates a RandomWalk
// the walk will continue until you have reached your maxSteps or until you walk out of bounds
public class RandomWalk {

    private int x;
    private int y;
    private int maxSteps;
    private int takenSteps;
    private int edge;
    private int maxDistX;
    private int maxDistY;

    public RandomWalk(int maxSteps, int edge) {
        this.maxSteps = maxSteps;
        this.edge = edge;
        this.x = 0;
        this.y = 0;
        this.takenSteps = 0;
        this.maxDistX = 0;
        this.maxDistY = 0;
    }

    public RandomWalk(int x, int y, int maxSteps, int edge) {
        this.x = x;
        this.y = y;
        this.maxSteps = maxSteps;
        this.edge = edge;
        this.maxDistX = x;
        this.maxDistY = y;
    }

    public void takeStep() {
        Random ran = new Random();
        int value = ran.nextInt(4);
        this.takenSteps++;
        //System.out.println(takenSteps);
        //System.out.println(value);
        

        switch (value) {
            case 0:
                this.x++;
                break;
            case 1:
                this.y++;
                break;
            case 2:
                this.x--;
                break;
            case 3:
                this.y--;
                break;

        }
        
        maxDistX = max(maxDistX, Math.abs(x));
        maxDistY = max(maxDistY, Math.abs(y));
        
    }

    public boolean moreSteps() {
        if (takenSteps < maxSteps) {
            return true;
        } else {
            return false;
        }
    }

    public boolean inBounds() {
        if (x < edge && y < edge && x > -edge && y > -edge) {
            System.out.println("x: " + x + "  y: " + y);
            return true;
        } else {

            System.out.println("Out of bounds mate!! steps: " + takenSteps);
            return false;
            
        }
    }
    
    public void walk() {
        while (moreSteps() && inBounds()) {
            takeStep();
        }
    }
    
    private int max(int num1, int num2){
        if(num1 < num2){
            return num2;
        }
        else{
            return num1;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getMaxSteps() {
        return maxSteps;
    }

    public void setMaxSteps(int maxSteps) {
        this.maxSteps = maxSteps;
    }

    public int getTakenSteps() {
        return takenSteps;
    }

    public void setTakenSteps(int takenSteps) {
        this.takenSteps = takenSteps;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

   
    public int getMaxDistX() {
        return maxDistX;
    }

    public int getMaxDistY() {
        return maxDistY;
    }
    

    @Override
    public String toString() {
        return "RandomWalk{" + "x=" + x + ", y=" + y + ", maxSteps=" + maxSteps + ", takenSteps=" + takenSteps + ", edge=" + edge + '}';
    }

}
