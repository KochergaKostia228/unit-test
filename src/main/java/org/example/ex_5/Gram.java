package org.example.ex_5;

public class Gram implements Weight{
    @Override
    public double translationTo(Weight targetWeight, double amount) {
        return amount * getMeasurementsUp(targetWeight);
    }

    @Override
    public double getMeasurementsUp(Weight targetWeight) {
        if (targetWeight instanceof Milligram) {
            return 1000;
        } else if (targetWeight instanceof Kilogram) {
            return 0.001;
        } else if (targetWeight instanceof Centner) {
            return 0.00001;
        } else if (targetWeight instanceof Ton) {
            return 0.000001;
        }
        return 1.0;
    }
}
