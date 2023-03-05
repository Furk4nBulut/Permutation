import java.util.HashSet;
import java.util.Scanner;
public class Permutation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the string which you want to find all permutations: ");
        String input = scan.next();
        result = generatePermutations(input);
        permutations(result);
        System.out.println("The factorial is: " + factorial(counter));
    }
    public static int counter=0; //declared a public counter to use in factorial method.

   public static HashSet<String> result = new HashSet<String>(); // declared a hashset list.
                                                                  // To use in methods.
    public static int factorial (int counter) {
                return counter;
    }

    public static HashSet<String> generatePermutations(String input) {
        HashSet<String> result = new HashSet<String>(); // Ask your teacher(!)
        if (input.length() == 1) {
            result.add(input);
            return result; //hash list created.
        } else {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                String newText = input.substring(0, i) + input.substring(i + 1);
                for (String addingPerm : generatePermutations(newText)) {
                    result.add(c + addingPerm);
                }
            }
            counter = result.size(); // the size of list is created.
                                    // (this mean is the number of variations are also calculated due to the hashset.)
            return result; //hash list created
        }
    }
    public static void permutations(HashSet<String> result){
        int index = 0;
        for (String element : result) {
            System.out.println(element);
            index++;
        }
    }

}