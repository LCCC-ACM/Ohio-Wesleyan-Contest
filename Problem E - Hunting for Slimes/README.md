# Problem E - Hunting for Slimes
In a certain mine-based crafting game, the three-dimensional world is divided into discrete "blocks" of space.  A cube of blocks of some size NxNxN is called a "chunk" (the value of N is constant for each instance of the world).  The game system has pre-designated certain chunks as ones that spawn a special monster, called a slime, which you want to hunt down.  You’ve managed to excavate a three-dimensional rectangular area, and you’re wondering whether any slimes will show up.  Since you do know the size of the game’s chunks, but you don’t know where the boundaries between chunks are, it’s possible that your excavated region spans multiple chunks.  The question is: What is the maximum and minimum number of chunks your region can intersect with?

## Input
There will be several input instances.  Each input instance will consist of four numbers: *n x y z*, all ≤ 100.  A value of 0 for all values will mean end of input.  Otherwise, *n* is the size of the chunk (in cells), and *x y* and *z* are the dimensions (in cells) of the region you have excavated.

## Output
For each input instance *i*, output the line:

```
Case i: Min a, Max b
```

Where *a* is the smallest number of chunks your region could intersect, and *b* is the largest.  There is a single space after the comma.

## Sample Input:
```
9 11 11 11
1 5 5 5
20 8 9 10
0 0 0 0
```

## Sample Output:
```
Case 1: Min 8, Max 27
Case 2: Min 125, Max 125
Case 3: Min 1, Max 8
```