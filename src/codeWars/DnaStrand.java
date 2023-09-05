package codeWars;

public class DnaStrand {
    protected static String makeComplement(String dna) {
        //Your code
        String dnaUpdatedSting = "";
        for (int i = 0; i < dna.length(); i++) {
            System.out.println(dna.charAt(i));
            if(dna.toUpperCase().charAt(i) == 'A') {
                dnaUpdatedSting += "T";
            }
            if(dna.toUpperCase().charAt(i) == 'T') {
                dnaUpdatedSting += "A";
            }
            if(dna.toUpperCase().charAt(i) == 'C') {
                dnaUpdatedSting += "G";
            }
            if(dna.toUpperCase().charAt(i) == 'G') {
                dnaUpdatedSting += "C";
            }
        }
        return dnaUpdatedSting;
    }

    protected static String string1 = "ATTGC";
    protected static String string2 = "GTAT";

}
