class MedicalStaff {
    String name;
    MedicalStaff(String n){name=n;}
    public void shiftInfo(){System.out.println(name + " is scheduled for duty.");}
}
class Doctor extends MedicalStaff {
    Doctor(String n){super(n);}
    public void diagnose(){System.out.println(name + " diagnoses a patient.");}
}
class Nurse extends MedicalStaff {
    Nurse(String n){super(n);}
    public void assist(){System.out.println(name + " assists in surgery.");}
}
public class HospitalSystem {
    public static void main(String[] args) {
        MedicalStaff staff1 = new Doctor("Dr. Mehta");  // upcasting
        MedicalStaff staff2 = new Nurse("Nurse Asha");
        staff1.shiftInfo();
        staff2.shiftInfo();
          }
}
