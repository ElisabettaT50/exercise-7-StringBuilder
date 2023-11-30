/*
Scrivi un programma Java che abbia un metodo che prenda due stringhe e le compari
lessico-graficamente.
Il metodo dovrà restituire "Le due stringhe sono uguali" o "Le due stringhe sono differenti"
basandosi sul risultato del confronto.
Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.
 */
public class Main{
    public static void main(String[] args) {

    StringBuilder string1 = new StringBuilder("To be or not to be, that is the question...");
    StringBuilder string2 = new StringBuilder("\"to be or not to be... that is the question.\"");
    Confronto.compareStrings(string1, string2);
    }
}