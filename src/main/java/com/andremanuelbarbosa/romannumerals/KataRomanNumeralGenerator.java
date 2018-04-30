package com.andremanuelbarbosa.romannumerals;

import java.util.LinkedList;

/**
 * Kata Roman Numeral Generator Class
 * 
 * This class implements the Roman Numeral Generator Interface and provides an
 * implementation of a method that is able to generate Roman Numerals from a
 * specified Number. The list of fixed Roman Numerals is initialized and made
 * available for the conversion algorithm.
 * 
 * @author Andre Barbosa (andremanuelbarbosa@gmail.com)
 */
public class KataRomanNumeralGenerator implements RomanNumeralGenerator {

  private static LinkedList<RomanNumeral> romanNumerals;

  static {

    romanNumerals = new LinkedList<RomanNumeral>();

    romanNumerals.add(new RomanNumeral(1, "I"));
    romanNumerals.add(new RomanNumeral(4, "IV"));
    romanNumerals.add(new RomanNumeral(5, "V"));
    romanNumerals.add(new RomanNumeral(9, "IX"));
    romanNumerals.add(new RomanNumeral(10, "X"));
    romanNumerals.add(new RomanNumeral(40, "XL"));
    romanNumerals.add(new RomanNumeral(50, "L"));
    romanNumerals.add(new RomanNumeral(90, "XC"));
    romanNumerals.add(new RomanNumeral(100, "C"));
    romanNumerals.add(new RomanNumeral(400, "CD"));
    romanNumerals.add(new RomanNumeral(500, "D"));
    romanNumerals.add(new RomanNumeral(900, "CM"));
    romanNumerals.add(new RomanNumeral(1000, "M"));
  }

  /**
   * Generates a Roman Numeral from a Number
   * 
   * @param number
   *          the Number to be converted into a Roman Numeral
   * @return the Roman Numeral equivalent to the Number
   */
  public String generate(int number) {

    if ( number < 1 || number > 3999 ) {

      return null;
    }

    return this.generate(number, (romanNumerals.size() - 1));
  }

  /**
   * Generates a Roman Numeral from a Number
   * 
   * This method is separated from the previous one because it does need to
   * perform the range verification (1 and 3999) but more important, it receives
   * an argument index which is the upper limit position that the algorithm must
   * start looking for the best Roman Numeral match, which improves the
   * performance of the generation method when it enters the recursive execution
   * path.
   * 
   * @param number
   *          the Number to be converted into a Roman Numeral
   * @param index
   *          the upper index to start looking for the best Roman Numeral match
   * @return the Roman Numeral equivalent to the Number
   */
  private String generate(int number, int index) {

    StringBuilder stringBuilder = new StringBuilder();

    for (int i = index; i >= 0; i--) {

      if ( number >= romanNumerals.get(i).getValue() ) {

        stringBuilder.append(romanNumerals.get(i).getSymbol());

        if ( number > 1 ) {

          stringBuilder.append(this.generate(number - romanNumerals.get(i).getValue(), i));
        }

        break;
      }
    }

    return stringBuilder.toString();
  }

  /**
   * Returns the Kata Roman Numeral Generator Linked List of Roman Numerals
   * 
   * @return the Kata Roman Numeral Generator Linked List of Roman Numerals
   */
  public LinkedList<RomanNumeral> getRomanNumberals() {

    return romanNumerals;
  }
}
