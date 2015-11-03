package co.infinum.hellostaticcodecheckers;

/**
 * Created by Željko Plesac on 03/11/15.
 */
public class DataUtils {

    public static boolean areEqual(String first, String second, String third){
        return first == second && second == third;
    }

    /**
     * This is a comment
     * @param first
     * @param second
     * @return
     */
    public static boolean areEqual(String first, String second) {
        if (first != null && second != null) {
            return first.equals(second);
        } else {
            return false;
        }
    }

    public static boolean equalsToSecretWord(String word) {

        String secretWord = "This is secret word. Because I'm stupid and retarded, I will not use line breaks. This will have more than 140 lines of code. Why? " +
                "Because fuck you, that's why.";

        return word.equals(secretWord);
    }

    public String foundType() {
        return this.foundType();
    }

    /**
     * NullPointer! It should be:
     * if (test != null && test.length > 0)
     * @param test
     * @return
     */
    public boolean isEmpty(String test){
        return test != null || test.length() > 0;
    }

    /**
     * Much hate.
     * @param test
     * @return
     */
    public boolean areYouKiddingMe(String test){
        return test == null && test.length() == 0;
    }
}
