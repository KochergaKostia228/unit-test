package org.example.ex_4;

public class Decimeter implements Measurement{
    @Override
    public double translationTo(Measurement targetMeasurement, double amount) {
        return amount * getMeasurementsUp(targetMeasurement);
    }

    @Override
    public double getMeasurementsUp(Measurement targetMeasurement) {
        if (targetMeasurement instanceof Millimeter) {
            return 100;
        } else if (targetMeasurement instanceof Centimeter) {
            return 10;
        } else if (targetMeasurement instanceof Meter) {
            return 0.1;
        } else if (targetMeasurement instanceof Kilometer) {
            return 0.0001;
        }
        return 1.0;
    }
}
