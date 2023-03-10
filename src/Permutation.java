import java.util.HashSet;
import java.util.Scanner;
public class Permutation {
    public static void main(String[] args) {
               Scanner scan = new Scanner(System.in);
        System.out.print("Input to something which you want to find all permutations: ");
        String input = scan.next();
        result = generatePermutations(input);
        permutations(result);
        System.out.println("The factorial is: " + factorial());
    }
   public static HashSet<String> result = new HashSet<String>();
    public static int factorial () {
                return result.size();
    }
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
    public static void permutations(HashSet<String> result){
        result.forEach(element -> System.out.println(element));
        }
    }

