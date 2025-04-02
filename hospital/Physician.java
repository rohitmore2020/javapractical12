/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author rohitmore
 */
public class Physician extends Doctor {
    private int consultantfee;
    private int availabledays;

    public Physician(int consultantfee, int availabledays, String speciality, String DoctorId, String name, int age, char gender) {
        super(speciality, DoctorId, name, age, gender);
        this.consultantfee = consultantfee;
        this.availabledays = availabledays;
    }

    @Override
    public String toString() {
      
        return super.toString()+"\n* Physician * " + "\nConsultantfee : " + consultantfee + "\nAvailabledays : " + availabledays ;
    }
   
}
