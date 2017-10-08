public class Hamming {
    private String leftStrand;
    private String rightStrand;

    public Hamming(String leftStrand, String rightStrand) {
        if (!areStrandsOfEqualLength(leftStrand, rightStrand)) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    public int getHammingDistance() {
        if (areStrandsEmpty()) {
            return 0;
        }

        int distance = 0;

        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                distance++;
            }
        }

        return distance;
    }

    private boolean areStrandsOfEqualLength(String leftStrand, String rightStrand) {
        return leftStrand.length() == rightStrand.length();
    }

    private boolean areStrandsEmpty() {
        return leftStrand.isEmpty() && rightStrand.isEmpty();
    }

}
