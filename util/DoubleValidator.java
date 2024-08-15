package util;
public interface DoubleValidator {

    /**
     * An interface for using the {@link KeyboardReader} methods with double validators
     * @param candidate The double value to be validated.
     * @return `true` if the candidate is valid, `false` otherwise.
     */
    public boolean accept(double candidate);
}
