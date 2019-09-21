package com.edu.builder;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {

    private BMWModel benz = new BMWModel();

    public void setSequence(ArrayList<String> sequence) {
         this.benz.setSequence(sequence);
    }

    public CarModel getCarModel() {
        return this.benz;
    }
}
