/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secretariat;

import java.util.ArrayList;
import java.time.LocalDate;

/**
 *
 * @author andreieftimie
 */
public class Student {
    public String nume;
    public String prenume;
    public String email;
    public String specializare;
    public String grupa;
    
    public ArrayList<Document> documente = new ArrayList<>();
    public ArrayList<Nota> note = new ArrayList<>();
    
    public Student(String nume, String prenume, String email, String specializare, String grupa) {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.specializare = specializare;
        this.grupa = grupa;
    }
    
    public void adaugaNota(Number nota, String materie, LocalDate data) {
        Nota notaPrimita = new Nota(nota, materie, data);
        this.note.add(notaPrimita);
    }
    
    public void adaugaDocument(String titlu, String continut) {
        Document doc = new Document(titlu, continut);
        this.documente.add(doc);
    }
}
