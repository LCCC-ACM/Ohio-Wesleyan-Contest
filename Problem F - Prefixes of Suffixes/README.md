# Problem F - Prefixes of Suffixes
A **prefix** of a string is a substring that begins with the first character.  A **suffix** of a string is a substring that ends with the last character.  Given two strings, it’s pretty easy to find the longest common prefix.  For example, the longest common prefix of "contest" and "convict" is "con".  Some string matching algorithms want to find the longest common prefix of all suffixes of a string.  This isn’t very interesting with a string like "contest", but if I have a string like "abacab", we get the following table:

| Original String | Suffix | Longest common prefix length |
|-----------------|--------|------------------------------|
| abacab          | abacab | 6                            |
| abacab          | bacab  | 0                            |
| abacab          | acab   | 1                            |
| abacab          | cab    | 0                            |
| abacab          | ab     | 2                            |
| abacab          | b      | 0                            |

Rather than making you output an entire list of numbers, we’ll gather the results into one number by adding them all together.  So in this case, you’d output 9.

## Input
There will be several input instances, each consisting of one string per line.  Each string will consist entirely of lower-case letters, and be of maximum length 100.  If the string is exactly the word "end", then that signals end of input.  Otherwise, the string is to be processed using the rules given above.

## Output
For each input string *i*, output:

```
Case i: n
```
Where n is the sum of the length of the longest common prefix of the string with all of its suffixes.

## Sample Input:
```
abacab
abacabacab
end
```

## Sample Output:
```
Case 1: 9
Case 2: 20
```
