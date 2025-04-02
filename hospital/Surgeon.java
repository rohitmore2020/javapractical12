/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author rohitmore
 */
public class Surgeon extends Doctor {
    private String surgeryType;
    private byte yearsofexperience;

    public Surgeon(String surgeryType, byte yearsofexperience, String speciality, String DoctorId, String name, int age, char gender) {
        super(speciality, DoctorId, name, age, gender);
        this.surgeryType = surgeryType;
        this.yearsofexperience = yearsofexperience;
    }

    @Override
    public String toString() {
        return super.toString()+"\n* Surgeon * " + "\nSurgeryType : " + surgeryType + "\nYearsofexperience : " + yearsofexperience ;
    }
    
    
}
