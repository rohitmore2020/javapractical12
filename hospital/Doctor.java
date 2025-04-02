/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author rohitmore
 */
public class Doctor extends Hospital {
    private String speciality;
    private String DoctorId;

    public Doctor(String speciality, String DoctorId, String name, int age, char gender) {
        super(name, age, gender);
        this.speciality = speciality;
        this.DoctorId = DoctorId;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n* Doctor *" + "\nSpeciality : " + speciality + "\nDoctorId=" + DoctorId ;
    }
    
    
}
