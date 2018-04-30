package com.andremanuelbarbosa.romannumerals;

/**
 * Roman Numeral Generator Interface
 * 
 * @author Andre Barbosa (andremanuelbarbosa@gmail.com)
 */
public interface RomanNumeralGenerator {

  /**
   * Generates a Roman Numeral from a Number
   * 
   * @param number
   *          the Number to be converted into a Roman Numeral
   * @return the Roman Numeral equivalent to the Number
   */
  public String generate(int number);
}
