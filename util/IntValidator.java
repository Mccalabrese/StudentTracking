package util;

public interface IntValidator {

    /**
     * An interface for using the {@link KeyboardReader} methods with Int validators
     * @param candidate The integer value to be validated.
     * @return `true` if the candidate is valid, `false` otherwise.
     */
    public boolean accept(int candidate);
}
