### Program Overview

This Java program reads a string from the user, generates all possible permutations of that string, and displays them. It also calculates the number of permutations, which is effectively the factorial of the length of the string.

### MCBU Introduction to Programming Assignment
This project is an assignment for the "Introduction to Programming" course at MCBU. The assignment focuses on implementing and understanding the concept of permutations in programming.

### Code Explanation

#### Imports

```java
import java.util.HashSet;
import java.util.Scanner;
```

- `HashSet`: Used to store unique permutations, ensuring no duplicates.
- `Scanner`: Used to read user input from the console.

#### Main Method

```java
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Input to something which you want to find all permutations: ");
    String input = scan.next();
    result = generatePermutations(input);
    permutations(result);
    System.out.println("The factorial is: " + factorial());
}
```

1. **Reading Input**:
   - The program prompts the user to input a string.
   - `scan.next()` reads the string input from the user.

2. **Generating Permutations**:
   - `generatePermutations(input)` is called to compute all permutations of the input string.
   - The result is stored in the `result` variable.

3. **Displaying Permutations**:
   - `permutations(result)` is called to print each permutation.

4. **Displaying Factorial**:
   - `factorial()` is called to calculate and print the number of permutations, which is the factorial of the string length.

#### Class Variables and Methods

```java
public static HashSet<String> result = new HashSet<String>();
```

- `result` is a `HashSet` to store unique permutations of the input string.

```java
public static int factorial() {
    return result.size();
}
```

- Returns the number of unique permutations, which corresponds to the factorial of the string length.

```java
public static HashSet<String> generatePermutations(String input) {
    HashSet<String> result = new HashSet<String>();
    if (input.length() == 1) {
        result.add(input);
        return result;
    } else {
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            String newText = input.substring(0, i) + input.substring(i + 1);
            for (String addingPermutation : generatePermutations(newText)) {
                result.add(letter + addingPermutation);
            }
        }
        return result;
    }
}
```

- **Base Case**: If the string length is 1, it returns a set containing the string itself.
- **Recursive Case**:
  - Iterates through each character in the string.
  - Fixes the character and generates permutations of the remaining substring.
  - Combines the fixed character with permutations of the remaining characters.

```java
public static void permutations(HashSet<String> result) {
    result.forEach(element -> System.out.println(element));
}
```

- Iterates through the `result` set and prints each permutation.

### Summary

- The program uses recursion to generate all permutations of a given string.
- A `HashSet` is used to store and ensure unique permutations.
- The program calculates the total number of permutations, which is equivalent to the factorial of the length of the input string.
- The final output includes all permutations and the total count of permutations.
