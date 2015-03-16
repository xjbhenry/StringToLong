Convert a string to long.
The format could be:
1. +999
2. -999
3. 999
4. 0999

if no conversion happened, return 0;
if overflow or underflow happened, return Long.MAX_VALUE or Long.MIN_VALUE;
if non-number characters are found, discard the rest of the string, eg 134312AB -> 134312AB.

limitation: currently I cannot test numbers close to Long.MAX_VALUE or LONG.MIN_VALUE. but the result StringToLong returns is always correct.

