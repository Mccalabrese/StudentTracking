package util;
import java.io.*;

/**
 *Provides a convenient way to get user input from the console with validation capabilities
 */
public class KeyboardReader {

  /**
   * New input variable shared by all instances of the KeyboardReader class
   */
  private static BufferedReader in =
      new BufferedReader(new InputStreamReader(System.in));

  /**
   * An empty default constructor
   */
  public KeyboardReader() { }

  /**
   * A method for receiving string input from user
   * @param prompt input from user
   * @return user input
   */
  public static String getPromptedString(String prompt) {
    String response = null;
    System.out.print(prompt);
    try {
      response = in.readLine();
    } catch (IOException e) {
      System.out.println("IOException occurred");
    }
    return response;
  }

  /**
   * A method for receiving only one character from the user
   * @param prompt user input
   * @return only the first character entered by the user
   */
  public static char getPromptedChar(String prompt) {
    return getPromptedString(prompt).charAt(0);
  }

  /**
   *A method for receiving an integer from the user
   * @param prompt user input
   * @return the integer of the users input
   */
  public static int getPromptedInt(String prompt) {
    return Integer.parseInt(getPromptedString(prompt));
  }

  /**
   *A method for receiving an integer from the user, with an error message defined
   * @param prompt user input
   * @param errMsg user defined error message
   * @return the integer of the users input
   */
  public static int getPromptedInt(String prompt, String errMsg) {
    for ( ; ; ) {
      try {
        return Integer.parseInt(getPromptedString(prompt));
      } catch (NumberFormatException e) {
        System.out.println(errMsg);
      }
    }
  }

  /**
   * A method for receiving an integer from the user, with an error message defined, a validator, and a message for a validator error
   * @param prompt user input
   * @param formatErrMsg error message for formatting
   * @param val validator interface
   * @param valErrMsg validator error message
   * @return user defined int, num
   */
  public static int getPromptedInt(
      String prompt, String formatErrMsg, 
      IntValidator val, String valErrMsg) {
    for ( ; ; ) {
      try {
        int num = Integer.parseInt(getPromptedString(prompt));
        if (val.accept(num)) return num;
        else System.out.println(valErrMsg);
      } catch (NumberFormatException e) {
        System.out.println(formatErrMsg);
      }
    }
  }

  /**
   * A method for receiving a float from the user
   * @param prompt user input
   * @return float value from user input
   */
  public static float getPromptedFloat(String prompt) {
    return Float.parseFloat(getPromptedString(prompt));
  }

  /**
   * A method for receiving a float from the user, and a user defined error message
   * @param prompt user input
   * @param errMsg user defined error message
   * @return float value from user input
   */
  public static float getPromptedFloat(String prompt, String errMsg) {
    for ( ; ; ) {
      try {
        return Float.parseFloat(getPromptedString(prompt));
      } catch (NumberFormatException e) {
        System.out.println(errMsg);
      }
    }
  }

  /**
   * A method for receiving a float from the user, and a user defined error message for formatting, a defined validator, and a defined validator error message
   * @param prompt user input
   * @param formatErrMsg error message for formatting
   * @param val the validator to be used
   * @param valErrMsg error message for the validator
   * @return float value from user input, num
   */
  public static float getPromptedFloat(
      String prompt, String formatErrMsg, 
      FloatValidator val, String valErrMsg) {
    for ( ; ; ) {
      try {
        float num = Float.parseFloat(getPromptedString(prompt));
        if (val.accept(num)) return num;
        else System.out.println(valErrMsg);
      } catch (NumberFormatException e) {
        System.out.println(formatErrMsg);
      }
    }
  }

  /**
   * A method for receiving a double from the user
   * @param prompt user input
   * @return float double from user input
   */
  public static double getPromptedDouble(String prompt) {
    return Double.parseDouble(getPromptedString(prompt));
  }

  /**
   * A method for receiving a double from the user, and a user defined error message
   * @param prompt user input
   * @param errMsg user defined error message
   * @return float double from user input
   */
  public static double getPromptedDouble(String prompt, String errMsg) {
    for ( ; ; ) {
      try {
        return Double.parseDouble(getPromptedString(prompt));
      } catch (NumberFormatException e) {
        System.out.println(errMsg);
      }
    }
  }

  /**
   * A method for receiving a double from the user, and a user defined error message for formatting, a defined validator, and a defined validator error message
   * @param prompt user input
   * @param formatErrMsg error message for formatting
   * @param val the validator to be used
   * @param valErrMsg error message for the validator
   * @return double value from user input, num
   */
  public static double getPromptedDouble(
      String prompt, String formatErrMsg, 
      DoubleValidator val, String valErrMsg) {
    for ( ; ; ) {
      try {
        double num = Double.parseDouble(getPromptedString(prompt));
        if (val.accept(num)) return num;
        else System.out.println(valErrMsg);
      } catch (NumberFormatException e) {
        System.out.println(formatErrMsg);
      }
    }
  }
}
