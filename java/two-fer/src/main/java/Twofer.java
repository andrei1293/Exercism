public class Twofer {
    private static final String PATTERN = "One for %s, one for me.";

    public String twofer(String name) {
        if (name == null) {
            name = "you";
        }

        return String.format(PATTERN, name);
    }
}
