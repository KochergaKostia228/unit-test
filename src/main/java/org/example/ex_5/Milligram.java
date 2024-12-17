package org.example.ex_5;

public class Milligram implements Weight{
    @Override
    public double translationTo(Weight targetWeight, double amount) {
        return amount * getMeasurementsUp(targetWeight);
    }

    @Override
    public double getMeasurementsUp(Weight targetWeight) {
        if (targetWeight instanceof Gram) {
            return 0.001;
        } else if (targetWeight instanceof Kilogram) {
            return 0.000001;
        } else if (targetWeight instanceof Centner) {
            return 0.00000001;
        } else if (targetWeight instanceof Ton) {
            return 0.000000001;
        }
        return 1.0;
    }
}
