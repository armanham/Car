package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setMakeCars("BMW");
        car.setYearCars(2002);
        car.setSpeedCars(100);
        System.out.println(car.getMakeCars());
        System.out.println(car.getYearCars());
        System.out.println(car.getMaxSpeedCars());
    }
}
