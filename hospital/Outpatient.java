/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author rohitmore
 */
public class Outpatient extends Patient {
    private String apointmentDate;
    private String prescribeMedicine;

    public Outpatient(String apointmentDate, String prescribeMedicine, String PatientId, String disease, boolean admitted, String name, int age, char gender) {
        super(PatientId, disease, admitted, name, age, gender);
        this.apointmentDate = apointmentDate;
        this.prescribeMedicine = prescribeMedicine;
    }

    @Override
    public String toString() {
        return super.toString()+"\n* Outpatient *" + "\nApointmentDate :" + apointmentDate + "\nPrescribeMedicine : " + prescribeMedicine ;
    }
    
    
}
