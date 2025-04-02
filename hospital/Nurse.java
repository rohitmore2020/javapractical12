/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author rohitmore
 */
public class Nurse extends Hospital {
    private String NurseId;
    private String department;

    public Nurse(String NurseId, String department, String name, int age, char gender) {
        super(name, age, gender);
        this.NurseId = NurseId;
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString()+"\n* Nurse *" + "\nNurseId : " + NurseId + "\nDepartment : " + department;
    }
    
    
}
