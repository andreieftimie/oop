/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package secretariat;

import java.time.*;

/**
 *
 * @author andreieftimie
 */
public class Secretariat {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Registru registru = new Registru();
        
        registru.inregistrareStudent("Ion", "Pop", "ipop@gmail.com", "IE", "Grupa 1");
        registru.inregistrareStudent("Chat", "GPT", "chat@gpt", "Finante", "Grupa 1");
        
        // listam toti studentii
        registru.arataStudenti();
        
        // Note pt ChatGPT
        Student chatGPT = registru.cautaStudent("chat@gpt");
        chatGPT.adaugaNota(10, "POO", LocalDate.of(2023, Month.JANUARY, 1));
        chatGPT.adaugaNota(1, "Limba Română", LocalDate.of(2023, Month.JANUARY, 10));
        
        // Note pt Ion Pop
        Student ionPop = registru.cautaStudent("ipop@gmail.com");
        ionPop.adaugaNota(8, "POO", LocalDate.of(2023, Month.JANUARY, 1));
        ionPop.adaugaNota(6, "Limba Română", LocalDate.of(2023, Month.JANUARY, 10));
        
        // cu note
        registru.arataStudenti();
        
        
        // Aduagam documente
        chatGPT.adaugaDocument("Carnet de Student", "Numar matricol 42");
        chatGPT.adaugaDocument("Adeverinta de Student", "Se atestă că ChatGPT este un student 'real'");
        
        ionPop.adaugaDocument("Carnet de Student", "Numar matricol 160");
        
        // cu note + documente
        registru.arataStudenti();
    }
}
