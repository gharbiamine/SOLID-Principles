package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarData {
        private List<Car> _carsDb = Arrays
                        .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
                                        new Car("3", "Megane", "Renault"));

        public List<Car> getCars() {
                return _carsDb;
        }

        public void setCars(List<Car> cars) {
                _carsDb = cars;
        }

}
