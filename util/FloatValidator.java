package util;

/**
 *An interface for using the {@link KeyboardReader} methods with float validators
 */
public interface FloatValidator {

    /**
     * An interface for using the {@link KeyboardReader} methods with float validators
     * @param candidate The float value to be validated.
     * @return `true` if the candidate is valid, `false` otherwise.
     */
    public boolean accept(float candidate);
}
