package org.example.ex_5;

public class Ton implements Weight{
    @Override
    public double translationTo(Weight targetWeight, double amount) {
        return amount * getMeasurementsUp(targetWeight);
    }

    @Override
    public double getMeasurementsUp(Weight targetWeight) {
        if (targetWeight instanceof Milligram) {
            return 1000000000;
        } else if (targetWeight instanceof Gram) {
            return 1000000;
        } else if (targetWeight instanceof Kilogram) {
            return 1000;
        } else if (targetWeight instanceof Centner) {
            return 10;
        }
        return 1.0;
    }
}
