package Middle.HomeWorkout;

public class Jump extends Exercises {
    private double weight;
    private int times;

    public Jump(double weight, int times) {
        this.weight = weight;
        this.times = times;
    }

    @Override
    double calculateCaloriesPerMinute() {
        double intensiveFactor = 0.10;
        double caloriesPerMinute = weight * intensiveFactor * times;
        return caloriesPerMinute;
    }
}
