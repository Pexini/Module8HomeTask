package Middle.HomeWorkout;

public class PushUps extends Exercises{
    private double weight;
    private double times;
    public PushUps(double weight, double times) {
        this.weight = weight;
        this.times = times;
    }

    @Override
    double calculateCaloriesPerMinute() {
        double intensiveFactor = 0.250;
        double caloriesPerMinute = weight * intensiveFactor * times;
        return caloriesPerMinute;
    }
}
