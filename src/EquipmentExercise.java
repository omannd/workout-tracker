public class EquipmentExercise extends Exercise{
    private String equipmentName;

    public EquipmentExercise(String name, int sets, int reps, String equipmentName) {
        super(name, sets, reps);
        this.equipmentName = equipmentName;
    }

    @Override
    public void showDetails() {
        System.out.println("[Aletli] " + getName() + " | " + getSets() + "x" + getReps() + " | Ekipman: " + equipmentName);
    }
}
