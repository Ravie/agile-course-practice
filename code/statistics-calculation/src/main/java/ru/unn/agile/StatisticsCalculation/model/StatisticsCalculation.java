package ru.unn.agile.StatisticsCalculation.model;

public final class StatisticsCalculation {
    public static double calculateExpectedValue(final Number[] values,
                                                final Double[] probabilities) {
        DistributionChecker.validate(values, probabilities);
        Double result = 0.0;
        for (int i = 0; i < values.length; i++) {
            result += values[i].doubleValue() * probabilities[i];
        }
        return result;
    }

    public static double calculateDispersion(final Number[] values,
                                             final Double[] probabilities) {
        return 0.0;
    }

    private StatisticsCalculation() { }
}
