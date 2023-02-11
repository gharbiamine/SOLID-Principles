package com.directi.training.lsp.exercise;

public class ElectronicDuck implements IDuck {
    private boolean _on = false;

    public void quack() {
        this.turnOn();
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new RuntimeException("Can't quack when off");
        }
        this.turnOff();
    }

    public void swim() {
        this.turnOn();
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            throw new RuntimeException("Can't swim when off");
        }
        this.turnOff();
    }

    public void turnOn() {
        _on = true;
    }

    public void turnOff() {
        _on = false;
    }
}
