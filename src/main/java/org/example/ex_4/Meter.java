package org.example.ex_4;

public class Meter implements Measurement{
    @Override
    public double translationTo(Measurement targetMeasurement, double amount) {
        return amount * getMeasurementsUp(targetMeasurement);
    }

    @Override
    public double getMeasurementsUp(Measurement targetMeasurement) {
        if (targetMeasurement instanceof Millimeter) {
            return 1000;
        } else if (targetMeasurement instanceof Centimeter) {
            return 100;
        } else if (targetMeasurement instanceof Decimeter) {
            return 10;
        } else if (targetMeasurement instanceof Kilometer) {
            return 0.001;
        }
        return 1.0;
    }
}
