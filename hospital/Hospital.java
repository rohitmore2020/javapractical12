/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

/**
 *
 * @author rohitmore
 */
public class Hospital {
        
    private String name;
    private int age;
    private char gender; // M for male and F for female 

    public Hospital(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
       return "* Hospital *" + "\nName : "+name + "\nAge : "+age +"\nGender : "+gender ;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Physician p1 = new Physician(1000 , 4 , "heart" , "XYZ" , "Amba singh" , 69 , 'M');
        System.out.println(p1);
    
    }
}
