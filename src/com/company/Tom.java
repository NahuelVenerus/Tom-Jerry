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

    private int calculateSpeed(){
        return 5 + energy/10;
    }

    public int energyGained(Mouse mouse){
        return FIXED_ENERGY_GAIN + mouse.getWeight();
    }

    public void sumEnergy(Mouse mouse){
        energy = energy + energyGained(mouse);
    }

    public void diminishEnergy(int meters){
        energy = energiaReducida(meters);
    }

    private int energiaReducida(int meters) {
        return energy - meters /2;
    }

    public boolean meConvieneComerRatonA(Mouse mouse, int meters) {
        return energyGained(mouse) > energiaReducida(meters);
        }
    }
