# Problem D - Count the Kingdoms
Minnesota Smith, the famed archaeologist, has come to you with a problem.  She has been excavating an area of the wilderness that, in the past, was home to some unknown number of kingdoms.  She has found a collection of tombstones stating the starting and ending dates of each king's reign, but not the countries the king was in charge of. (Apparently the people who made the tombstones thought it was obvious.  They were wrong).  What's worse, she has only found the tombstones for some of the kings - the rest have been lost.  So it's not possible to get a complete chronology of the rulers.

However, realizing each kingdom can only be ruled by one king at a time, Minnesota has asked you to determine a lower bound on the number of kingdoms.

For example, if you had three tombstones: King Albert, who reigned from year 1 to year 10, King Bernard, who reigned from year 2 to year 20, and King Charles who reigned from year 12 to year 30, you can say that there are at least two kingdoms (Albert and Charles could possibly be from the same kingdom).  If instead, Charles reigned from years 9-30, then they would all have to rule different kingdoms.

## Input
There will be several input instances.  Each instance will begin with an integer *n* (≤100), denoting the number of tombstones found.  A value of *n* = 0 will denote end of input.  Otherwise, there will *n* pairs of integers *s* and *e* (each ≤ 1000000, *s* ≤ *e*) marking the start and end years of the king's reign.  Since you only have information about the years, you should treat two kings who reign in the same year as overlapping (and thus need to have led different kingdoms).

## Output
For each input instance *i*, output the line:

```
Case i: k
```

Where *k* is the maximal lower bound on the number of kingdoms you have found.

## Sample Input:
```
3 
1 10
2 20
12 30
3 
1 10
2 20
9 30
0
```

## Sample Output:
```
Case 1: 2
Case 2: 3
```