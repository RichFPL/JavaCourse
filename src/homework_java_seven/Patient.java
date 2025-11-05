package homework_java_seven;

public class Patient extends Hospital {
    private int treatmentPlan;
    private Hospital doctor;

    public Patient(int treatmentPlanPlan) {
        this.treatmentPlan = treatmentPlanPlan;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public Hospital getDoctor() {
        return doctor;
    }

    public void setDoctor(Hospital doctor) {
        this.doctor = doctor;
    }
}
