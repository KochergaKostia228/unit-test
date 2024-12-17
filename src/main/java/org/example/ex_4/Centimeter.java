package org.example.ex_4;

public class Centimeter implements Measurement{
    @Override
    public double translationTo(Measurement targetMeasurement, double amount) {
        return amount * getMeasurementsUp(targetMeasurement);
    }

    @Override
    public double getMeasurementsUp(Measurement targetMeasurement) {
        if (targetMeasurement instanceof Millimeter) {
            return 10;
        } else if (targetMeasurement instanceof Decimeter) {
            return 0.1;
        } else if (targetMeasurement instanceof Meter) {
            return 0.01;
        } else if (targetMeasurement instanceof Kilometer) {
            return 0.00001;
        }
        return 1.0;
    }
}
