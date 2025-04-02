/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author rohitmore
 */
public class Patient extends Hospital {
    private String PatientId;
    private String disease;
    private boolean admitted;
    
    public Patient(String PatientId, String disease, boolean admitted, String name, int age, char gender) {
        super(name, age, gender);
        this.PatientId = PatientId;
        this.disease = disease;
        this.admitted = admitted;
    }

    @Override
    public String toString() {
        return super.toString()+"\n* Patient * " + "\nPatientId : " + PatientId + "\nDisease : " + disease + "\nAdmitted : " + admitted ;
    }
    
    
}
