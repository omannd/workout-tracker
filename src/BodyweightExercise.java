public class BodyweightExercise extends Exercise {
    private String targetMuscle;

    public BodyweightExercise(String name, int sets, int reps, String targetMuscle) {
        super(name, sets, reps);
        this.targetMuscle = targetMuscle;
    }

    @Override
    public void showDetails() {
        System.out.println("[Vücut Ağırlığı] " + getName() + " | " + getSets() + "x" + getReps() + " | Hedef Kas: " + targetMuscle);
    }
}
