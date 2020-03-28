package com.company;

public class Tom {

    public static final int FIXED_ENERGY_GAIN = 12;
    public int energy;

    public Tom(int energy) {
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "Tom's final energy: " + energy;
    }

    private int speed(){
        int speed = 5;
        return speed + energy/10;
    }

    public int eat(Mouse mouse){
        int afterEatEnergy = energy + FIXED_ENERGY_GAIN + mouse.getWeight();
        return afterEatEnergy;
    }

    public int run(int distance){
        int runningEnergy = energy - distance/2;
        return runningEnergy;
    }

    public boolean iShouldEatMouse(){
        if(run()>eat(){
            return false;
        }
        return true;
    }

}
