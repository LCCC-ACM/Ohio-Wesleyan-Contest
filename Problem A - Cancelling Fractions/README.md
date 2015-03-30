# Problem A - Cancelling Fractions
One of the things they teach you in school is that when you cancel fractions, you **don’t** cancel the digits (instead, you cancel the factors).  So, for example you can’t take the fraction: 12/24, cancel the 2 from the top and bottom, and be left with the fraction 1/4.  
Except, sometimes you can.  If you start with the fraction 16/64, cancel the “6” from the top and bottom, you’re left with 16/64=  1/4, which are actually equivalent.  
Your job is to find out whether a fraction is “number-cancelable” in this way.

## Input
There are several input instances, one on each line.  Each instance will be two integers, *n* and *d*, each between 10 and 100,000, separated by a space.  A value of *n* = *d* = 0 will signify end of input.  The number *n* will signify the numerator of a fraction, and the number *d* will be the denominator.  Each *n* and *d* pair will have at least one digit in common (but may have more).

## Output
For each input case *i*, output either:  
```
Case i: n
```
Where *n* is a digit we can cancel from both the numerator and denominator, producing an equivalent fraction. If multiple digits can be cancelled, choose the smallest.  
Or, if no canceling is possible, output:  
```
Case i: Not possible
```

## Sample Input:
```
16 64
160 640
12 24
0 0
```

## Sample Output:
```
Case 1: 6
Case 2: 0
Case 3: Not possible
```