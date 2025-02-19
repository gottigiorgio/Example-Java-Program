package exampleprogram;
import java.util.Scanner; 
// Importare un pacchetto ci permette di utilizzare la/le funzione/i non presenti nel nostro codice


// Ogni programma in java deve essere in una classe!
public class ExampleProgram {

    // un "void" è un tipo di dato che non restituisce un valore, usato per le funzioni.
    public static void main(String[] args) {
        
       // Striga
        String stringa = "Ciao Mondo";
       
       // Intero
        int Intero = 12;
       
       // Valore Booleano
        boolean booleano = true;
       
       // Numero con virgola (Double)
        double numConVirgola = 3.14; // N.B. Il java utilizza l'inglese, quindi i numeri non sono con la virgola ma con il punto!
       System.out.println("Stringa: " + stringa + "\n" + "Intero: " + Intero + "\n" + "Booleano: " + booleano + "\n" + "Numero con virgola: " + numConVirgola);
        
       
       /*   Dichiariamo l'oggetto Scanner:
        *   Lo scanner ci permette di leggere l'input dell'utente.
        *   per Utilizzare lo scanner nel codice dobbiamo *Dichiararlo*
        *  
        *   Esempio di dichiarazione:
        *   NomeOggetto nomeIstanza = new Oggetto(args);
       */
        Scanner nomeScanner = new Scanner(System.in);
        
        // Esempio di programma base
         System.out.println("Inserisci un qualunque dato!");
         String dato = nomeScanner.nextLine();
        
         System.out.println("hai inserito: " + dato);
        
         nomeScanner.close(); // chiudiamo lo scanner una volta terminato il programma
        
    }
    
}
