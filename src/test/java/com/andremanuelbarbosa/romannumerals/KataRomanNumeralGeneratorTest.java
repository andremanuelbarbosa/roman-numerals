package com.andremanuelbarbosa.romannumerals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Kata Roman Numeral Generator Test Class
 * 
 * @author Andre Barbosa (andremanuelbarbosa@gmail.com)
 */
public class KataRomanNumeralGeneratorTest {

  private KataRomanNumeralGenerator kataRomanNumeralGenerator;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {

  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {

  }

  @Before
  public void setUp() throws Exception {

    this.kataRomanNumeralGenerator = new KataRomanNumeralGenerator();
  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testRomanNumerals() {

    Assert.assertNotNull(this.kataRomanNumeralGenerator);
    Assert.assertNotNull(this.kataRomanNumeralGenerator.getRomanNumberals());
    Assert.assertEquals(13, this.kataRomanNumeralGenerator.getRomanNumberals().size());
  }

  @Test
  public void testLowerLimit() {

    Assert.assertEquals("I", this.kataRomanNumeralGenerator.generate(1));
  }

  @Test
  public void testUpperLimit() {

    Assert.assertEquals("MMMCMXCIX", this.kataRomanNumeralGenerator.generate(3999));
  }

  @Test
  public void testBelowLimit() {

    Assert.assertNull(this.kataRomanNumeralGenerator.generate(0));
  }

  @Test
  public void testAboveLimit() {

    Assert.assertNull(this.kataRomanNumeralGenerator.generate(4000));
  }

  @Test
  public void test100() throws Exception {

    File file = new File(KataRomanNumeralGeneratorTest.class.getClassLoader().getResource("100.txt").getFile());
    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

    for (int i = 0; i < 100; i++) {

      Assert.assertEquals(bufferedReader.readLine(), this.kataRomanNumeralGenerator.generate((i + 1)));
    }

    bufferedReader.close();
  }
}
