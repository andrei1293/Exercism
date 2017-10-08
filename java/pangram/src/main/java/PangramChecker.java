import java.lang.Character;

public class PangramChecker {

    private boolean isLetterMissing(String input, int letter) {
        if (input.indexOf(letter) == -1 &&
                input.indexOf(Character.toUpperCase(letter)) == -1) {
            return true;
        }

        return false;
    }

    public boolean isPangram(String input) {
        int start = (int) 'a';
        int end = (int) 'z';

        for (int letter = start; letter <= end; letter++) {
            if (isLetterMissing(input, letter)) {
                return false;
            }
        }

        return true;
    }

}
