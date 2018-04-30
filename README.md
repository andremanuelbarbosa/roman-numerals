# Roman Numerals

IMPLEMENTATION

In order to provide a simple and fast method of converting numbers into the
equivalent Roman Numerals I have decided to create a list of fixed Roman
Numerals which contains not only the mapping between the basic seven symbols
I (1), V (5), X (10), L (50), C (100), D (500) and M (1000) but also the
preceding exceptions between them like IV (4), IX (9), XL (40), XC (90), CD
(400) and CM (900). These values were added to the static list on ordered way
so that the conversion algorithm can does not have to lookup the all list for
the next best match Roman Numeral but instead can use a decreasing approach by
trying to use the value on the last index and use the one before on the next
iteration until the value reaches zero.

TEST

The unit tests created for this application are a set of basic expectations
that the conversion algorithm is expected to deliver, from a successful
generation both on the lower and upper (1 and 3999) end but until the null
values expected from passing to the generation method numbers outside that
range. I have also implemented a unit test which verifies the first 100 Roman
Numerals using a text file which contains those values and comparing them to 
the ones returned by the Kata generator.
