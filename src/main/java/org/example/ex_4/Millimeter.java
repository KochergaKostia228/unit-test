package org.example.ex_4;

import org.example.ex_2.Euro;
import org.example.ex_2.Pound;
import org.example.ex_2.Yen;

public class Millimeter implements Measurement{
    @Override
    public double translationTo(Measurement targetMeasurement, double amount) {
        return amount * getMeasurementsUp(targetMeasurement);
    }

    @Override
    public double getMeasurementsUp(Measurement targetMeasurement) {
        if (targetMeasurement instanceof Centimeter) {
            return 0.1;
        } else if (targetMeasurement instanceof Decimeter) {
            return 0.01;
        } else if (targetMeasurement instanceof Meter) {
            return 0.001;
        } else if (targetMeasurement instanceof Kilometer) {
            return 0.000001;
        }
        return 1.0;
    }
}
