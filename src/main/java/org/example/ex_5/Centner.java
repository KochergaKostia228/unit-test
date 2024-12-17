package org.example.ex_5;

public class Centner implements Weight{
    @Override
    public double translationTo(Weight targetWeight, double amount) {
        return amount * getMeasurementsUp(targetWeight);
    }

    @Override
    public double getMeasurementsUp(Weight targetWeight) {
        if (targetWeight instanceof Milligram) {
            return 100000000;
        } else if (targetWeight instanceof Gram) {
            return 100000;
        } else if (targetWeight instanceof Kilogram) {
            return 100;
        } else if (targetWeight instanceof Ton) {
            return 0.1;
        }
        return 1.0;
    }
}