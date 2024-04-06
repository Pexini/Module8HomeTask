package Middle.HomeWorkout;

public class Main {
    public double caloriesBurned(Exercises exercises, int durationInMinutes) {
        double caloriesPerMinute = exercises.calculateCaloriesPerMinute();
        return caloriesPerMinute * durationInMinutes;
    }

    public static void main(String[] args) {
        Main calculator = new Main();

        Run run = new Run(85, 5);
        double caloriesBurnedRunning = calculator.caloriesBurned(run, 30);
        System.out.println("Калории сожженные бегом " + caloriesBurnedRunning);

        Jump jump = new Jump(85, 100);
        double caloriesBurnedJump = calculator.caloriesBurned(jump, 15);
        System.out.println("Калории сожженные прыжками " + caloriesBurnedJump);

        PushUps pushUps = new PushUps(85, 100);
        double caloriesBurnedPushUps = calculator.caloriesBurned(pushUps, 15);
        System.out.println("Калории сожженные отжиманиями " + caloriesBurnedJump);

    }
}