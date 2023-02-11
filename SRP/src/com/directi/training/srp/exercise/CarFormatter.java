package com.directi.training.srp.exercise;

public class CarFormatter {
    private CarData carData;

    CarFormatter(CarData carData) {
        this.carData = carData;
    }

    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        for (Car car : carData.getCars()) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
