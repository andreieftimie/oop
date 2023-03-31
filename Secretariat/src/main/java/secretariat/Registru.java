/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secretariat;

import java.util.ArrayList;

/**
 *
 * @author andreieftimie
 */
public class Registru {
    public ArrayList<Student> studenti = new ArrayList<>();
   
    public Registru() {
        
    }
    
    public void inregistrareStudent(String nume, String prenume, String email, String specializare, String grupa) {
        Student student = new Student(nume, prenume, email, specializare, grupa);
        this.studenti.add(student);
    }
    
    public Student cautaStudent(String email) {
        Student student = this.studenti.stream()
            .filter(studentCautat -> email.equals(studentCautat.email))
            .findAny()
            .orElse(null);
        return student;
    }
    
    public void arataStudenti() {
        System.out.print("\n---- \n\n");
        for (Student student : this.studenti) {
            System.out.print("Nume student: " + student.nume + " " + student.prenume + "; Email: " + student.email + "; Specializare: " + student.specializare + "; Grupa: " + student.grupa + "\n");
            if (!student.note.isEmpty()) {
                System.out.print("     Note student: \n");
            }
            for (Nota nota : student.note) {
                System.out.print("      - Materia: " + nota.materie + " Nota: " + nota.nota + " Data: " + nota.data + " \n");
            }
            
            if (!student.documente.isEmpty()) {
                System.out.print("     Documente student: \n");
            }
            for (Document doc : student.documente) {
                System.out.print("      - Document: " + doc.titlu + " Nota: " + doc.continut + " \n");
            }
            System.out.print("\n");
        }
    }
}
