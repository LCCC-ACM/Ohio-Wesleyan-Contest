# Problem B - Good Guys and Bad Guys
Little Joey is setting up figures on a board.  There are two kinds of figures: "Good Guys" and "Bad Guys."  Once the figures are set up, he turns to you and asks you to pair off the figures so every good guy is fighting a different adjacent bad guy (and vice versa).  Can you help him?

## Input
There will be multiple input instances.  Each input instance will begin with a number *N* (≤100), denoting the number of each kind of piece (so the board will have *N* good guys and *N* bad guys).  A value of *N* = 0 will signify end of input.  Otherwise, next will follow *N* pairs of numbers *r c*, the row and column of each good guy, followed by *N* more pairs of numbers *r c*, the row and column of each bad guy.  All *r* and *c* values will be between 0 and 1000 (inclusive)

## Output
For each input instance *i*, output either:

```
Case i: Possible
```

or

```
Case i: Not possible
```

A pairing is "possible" if we can pair the figures into groups of one good guy and one bad guy where:
 - The two figures are rectilinearly adjacent (no diagonals)
 - Each figure is in exactly one pairing

## Sample Input:
```
3
1 0
1 1 
1 2
0 1
2 1
2 2
2
1 2
2 1
1 1
2 2
0
```

## Sample Output:
```
Case 1: Not possible
Case 2: Possible
```