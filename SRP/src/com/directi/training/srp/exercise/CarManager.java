package com.directi.training.srp.exercise;

public class CarManager {
    private CarData carData;

    CarManager(CarData carData) {
        this.carData = carData;
    }

    public Car getFromDb(final String carId) {
        for (Car car : carData.getCars()) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

   

}
