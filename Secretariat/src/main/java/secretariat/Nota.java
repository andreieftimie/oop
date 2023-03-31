/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secretariat;

import java.time.LocalDate;

/**
 *
 * @author andreieftimie
 */
public class Nota {
    public Number nota;
    public String materie;
    public LocalDate data;
    
    public Nota(Number nota, String materie, LocalDate data) {
        this.nota = nota;
        this.materie = materie;
        this.data = data;
    }
}
