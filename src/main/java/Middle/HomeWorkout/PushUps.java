package Middle.HomeWorkout;

public class PushUps extends Exercises{
    private double weight;
    private double speed;
    public PushUps(double weight, double speed) {
        this.weight = weight;
        this.speed = speed;
    }

    @Override
    double calculateCaloriesPerMinute() {
        double intensiveFactor = 0.357;
        double caloriesPerMinute = weight * intensiveFactor * speed;
        return caloriesPerMinute;
    }
}
