import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Exercise> workoutRoutine = new ArrayList<>();

        BodyweightExercise pullUp = new BodyweightExercise("Barfiks", 4, 8, "Sırt");
        workoutRoutine.add(pullUp);

        EquipmentExercise chestPress = new EquipmentExercise("Dumbbell Press", 4, 10, "10kg Dambıl");
        workoutRoutine.add(chestPress);

        EquipmentExercise bicepCurl = new EquipmentExercise("Biceps Curl", 3, 12, "Direnç Bandı");
        workoutRoutine.add(bicepCurl);

        System.out.println("--- GÜNLÜK ANTRENMAN PROGRAMI ---");

        for (Exercise exercise : workoutRoutine) {
            exercise.showDetails();
        }
    }
}