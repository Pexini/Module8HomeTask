package Middle.HomeWorkout;

public class Run extends Exercises {
    private double weight;
    private double speed;

    public Run(double weight, double speed) {
        this.weight = weight;
        this.speed = speed;
    }

    @Override
    double calculateCaloriesPerMinute() {
        double intensiveFactor = 0.0120;
        double caloriesPerMinute = weight * intensiveFactor * speed;
        return caloriesPerMinute;
    }
}
