package com.directi.training.srp.exercise;

public class CarRanker {
    private CarData carData;

    CarRanker(CarData carData) {
        this.carData = carData;
    }

    public Car getBestCar() {
        Car bestCar = null;
        for (Car car : carData.getCars()) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
