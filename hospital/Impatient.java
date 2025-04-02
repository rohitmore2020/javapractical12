/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author rohitmore
 */
public class Impatient extends Patient {
    private short roomno;
    private String admissiondate;

    public Impatient(short roomno, String admissiondate, String PatientId, String disease, boolean admitted, String name, int age, char gender) {
        super(PatientId, disease, admitted, name, age, gender);
        this.roomno = roomno;
        this.admissiondate = admissiondate;
    }

    @Override
    public String toString() {
        return super.toString()+"\n* Impatient * " + "\nRoomno : " + roomno + "\nAdmissiondate : " + admissiondate ;
    }
    
    
}
