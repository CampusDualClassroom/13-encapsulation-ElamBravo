package com.campusdual.classroom;

public class FuelTank {

    private int actualFuel = 10;

    public int getActualFuel() {
        return this.actualFuel;
    }

    public void setActualFuel(int actualFuel) {
        if (actualFuel >= 0) {
            this.actualFuel = actualFuel;
        } else {
            System.out.println("Error:No se puede asiganr un valor negativo al tanque de combustible.");
        }
    }

    public void showDetails() {
        System.out.println("La capacidad actual es de " + getActualFuel() + " litros.");
    }

}
