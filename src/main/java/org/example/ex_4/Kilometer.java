package org.example.ex_4;

public class Kilometer implements Measurement{
    @Override
    public double translationTo(Measurement targetMeasurement, double amount) {
        return amount * getMeasurementsUp(targetMeasurement);
    }

    @Override
    public double getMeasurementsUp(Measurement targetMeasurement) {
        if (targetMeasurement instanceof Millimeter) {
            return 1000000;
        } else if (targetMeasurement instanceof Centimeter) {
            return 100000;
        } else if (targetMeasurement instanceof Decimeter) {
            return 10000;
        } else if (targetMeasurement instanceof Meter) {
            return 1000;
        }
        return 1.0;
    }
}
