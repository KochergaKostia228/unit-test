package org.example.ex_4;

import org.example.ex_2.Currency;

public interface Measurement {
    double translationTo(Measurement targetMeasurement, double amount);
    double getMeasurementsUp(Measurement targetMeasurement);
}
