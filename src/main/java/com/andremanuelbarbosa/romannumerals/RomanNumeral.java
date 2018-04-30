package com.andremanuelbarbosa.romannumerals;

/**
 * Roman Numeral Class
 * 
 * This class is a simple representation of the Roman Numeral object and holds
 * the basic information for those objects like the numeric value and the string
 * symbol.
 * 
 * @author Andre Barbosa (andremanuelbarbosa@gmail.com)
 */
public class RomanNumeral {

  private int value;

  private String symbol;

  /**
   * Class Constructor
   * 
   * @param value
   *          the Roman Numeral Value
   * @param symbol
   *          the Roman Numeral Symbol
   */
  public RomanNumeral(int value, String symbol) {

    this.value = value;
    this.symbol = symbol;
  }

  /**
   * Returns the Roman Numeral Value
   * 
   * @return the Roman Numeral Value
   */
  public int getValue() {

    return this.value;
  }

  /**
   * Returns the Roman Numeral Symbol
   * 
   * @return the Roman Numeral Symbol
   */
  public String getSymbol() {

    return this.symbol;
  }
}
