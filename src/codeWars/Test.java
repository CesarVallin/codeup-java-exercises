package codeWars;

public class Test {
    public static void main(String[] args) {

        String dnaTest = DnaStrand.makeComplement(DnaStrand.string1);
        System.out.println(dnaTest + " ...expected " + " TAACG");
    }
}
