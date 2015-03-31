# Problem C - Iterated Bubbles
When you blow bubbles, you stick the bubble wand into a dish filled with solution and blow.  When you blow, several bubbles come out.  It is possible to catch one of the bubbles you've blown on the bubble wand, and re-blow, giving yourself a new set of bubbles.  When you do this, you will have less bubbles in the new set, and they will all use less bubble solution.  You can repeat this process by catching one of the new bubbles, and so on.  

Suppose you're a good enough bubble blower that each time you blow bubbles, you always blow a new amount of bubbles that is a constant percentage of the number of bubbles you blew the last time (rounding down in the case of fractional bubbles), and all of the new bubbles that are re-blown evenly distribute the bubble solution you are currently using.  Then, this process of re-blowing bubbles will stop in one of two ways:
 - Either the number of bubbles you are about to blow gets rounded down to zero bubbles, or:
 - Each bubble that you are to blow is not given enough solution to form the outline of a bubble (so the bubbles never get created)
How many sets of bubbles can you blow from the initial amount of bubble solution?

## Input
There will be several input instances.  Each input instance will begin with an integer *s*.  A value of *s* = 0 denotes end of input.  Otherwise, *s* is the amount of solution you start with, and three more integers, *n*, *p*, and *m*, will follow.  *n* is the number of bubbles initially blown, *p* is the percentage of bubbles you want to retain when you re-blow, and *m* is the minimum amount of solution you need to successfully blow bubbles.  You can assume *s* ≥ *m*, and that the initial solution is evenly distributed among the *n* initial bubbles.  The maximum value of *p* is 100, the maximum values of *s*, *n*, and *m* are 1,000,000,000.

## Output
For each input instance *i*, output the line:

```
Case i: b
```

Where *b* is the number of times you can blow bubbles using the method above.

## Sample Input:
```
100000 300 50 1
10000 10 2 1
500000 20 90 1
0 0 0 0
```

## Sample Output:
```
Case 1: 2
Case 2: 1
Case 3: 4
```