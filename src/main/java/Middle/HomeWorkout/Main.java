package Middle.HomeWorkout;

public class Main {
    public double caloriesBurnedRunning(Exercises exercises, int durationInMinutes) {
        double caloriesPerMinute = exercises.calculateCaloriesPerMinute();
        return caloriesPerMinute * durationInMinutes;
    }

    public static void main(String[] args) {
        Main calculator = new Main();

        Run run = new Run(85, 1.75);
        double caloriesBurnedRunning = calculator.caloriesBurnedRunning(run, 30);
        System.out.println("Калории сожженые бегом " + caloriesBurnedRunning);
    }
}