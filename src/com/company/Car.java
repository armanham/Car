package com.company;

public class Car {
    private int yearCars;
    private String makeCars;
    private int maxSpeedCars;

    public Car(int yearCars, String makeCars, int maxSpeedCars) {
        setMakeCars(makeCars);
        setYearCars(yearCars);
        setSpeedCars(maxSpeedCars);
    }

    public Car() {

    }

    public void setYearCars(int yearCars) {
        if (yearCars >= 1800 && yearCars <= 2021) {
            this.yearCars = yearCars;
        } else System.out.println("Year is invalid: ");
    }

    public void setMakeCars(String makeCars) {
        this.makeCars = makeCars;
    }

    public void setSpeedCars(int maxSpeedCars) {
        if (maxSpeedCars <= 85 && maxSpeedCars >= 0) {
            this.maxSpeedCars = maxSpeedCars;
        } else System.out.println("Speed is invalid: ");
    }

    public int getYearCars() {
        System.out.print("Year: ");
        return yearCars;
    }

    public String getMakeCars() {
        System.out.print("Model: ");
        return makeCars;
    }

    public int getMaxSpeedCars() {
        System.out.print("Max speed: ");
        return maxSpeedCars;
    }
}
