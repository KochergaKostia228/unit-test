package org.example.ex_5;

import org.example.ex_4.Measurement;

public interface Weight {
    double translationTo(Weight targetWeight, double amount);
    double getMeasurementsUp(Weight targetWeight);
}
