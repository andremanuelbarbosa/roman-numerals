package com.andremanuelbarbosa.romannumerals;

/**
 * Coding Kata Main Abstract Class
 * 
 * @author Andre Barbosa (andremanuelbarbosa@gmail.com)
 */
public abstract class Main {

  /**
   * Coding Kata Main Runnable Method
   * 
   * @param args
   *          the command line arguments, where each argument is a number to be
   *          converted into a Roman Numeral
   */
  public static void main(String[] args) {

    KataRomanNumeralGenerator codingKataRomanNumeralGenerator = new KataRomanNumeralGenerator();

    for (int i = 0; i < args.length; i++) {

      System.out.println(codingKataRomanNumeralGenerator.generate(Integer.parseInt(args[i])));
    }
  }
}
