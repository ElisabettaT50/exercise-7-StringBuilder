public class Confronto {
    StringBuilder string1;
    StringBuilder string2;

    Confronto(StringBuilder string1, StringBuilder string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    public static void compareStrings(StringBuilder string1, StringBuilder string2) {
        if (string1.equals(string2)) {
            System.out.println("Le due stringhe sono uguali.");
        } else {
            System.out.println("Le due stringhe sono differenti.");
        }
    }
}

