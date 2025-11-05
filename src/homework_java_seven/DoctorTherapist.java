package homework_java_seven;

public class DoctorTherapist extends Hospital {
    @Override
    public void treatment() {
        System.out.println("Терапевт: лечит общие заболевания");
    }

    public void givePlan(Patient patient) {
        int healingPlan = patient.getTreatmentPlan();
        if (healingPlan == 1) {
            patient.setDoctor(new DoctorSurgeon());
        } else if (healingPlan == 2) {
            patient.setDoctor(new DoctorDantist());
        } else {
            patient.setDoctor(new DoctorTherapist());
        }
        System.out.print("Пациента будет лечить - ");
        patient.getDoctor().treatment();
    }
}
