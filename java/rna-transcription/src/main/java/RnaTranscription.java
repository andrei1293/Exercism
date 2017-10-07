public class RnaTranscription {
    private static final char[] dnaNucleotides = { 'G', 'C', 'T', 'A' };
    private static final char[] rnaNucleotides = { 'C', 'G', 'A', 'U' };

    private char transcribeNucleotide(char dnaNucleotide) {
        for (int i = 0; i < dnaNucleotides.length; i++) {
            if (dnaNucleotide == dnaNucleotides[i]) {
                return rnaNucleotides[i];
            }
        }

        throw new IllegalArgumentException("Invalid input");
    }

    public String transcribe(String dnaStrand) {
        String rnaStrand = "";

        for (int i = 0; i < dnaStrand.length(); i++) {
            rnaStrand += transcribeNucleotide(dnaStrand.charAt(i));
        }

        return rnaStrand;
    }

}
