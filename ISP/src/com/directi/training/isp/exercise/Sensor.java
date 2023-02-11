package com.directi.training.isp.exercise;

import java.util.Random;

public class Sensor {
    public void register(IProximity proximityDoor) {
        while (true) {
            if (isPersonClose()) {
                proximityDoor.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose() {
        return new Random().nextBoolean();
    }
}
