import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class Permutation {
    public static void main(String[] args) {
        /* The first test string is "ABCDEF".Its result must be 720.
           The second test sting is "ABACBC".Its result must be 90.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the string which you want to find all permutations: ");
        String input = scan.next();
        result = generatePermutations(input);
        permutations(result);
        System.out.println("The factorial is: " + factorial());
    }
   // public static int counter=0; //declared a public counter to use in factorial method.

   public static HashSet<String> result = new HashSet<String>(); // declared a hashset list.
                                                                  // To use in methods.
    public static int factorial () {
                return result.size();
    } // For printing factorial.

    public static HashSet<String> generatePermutations(String input) { // this method is generating variatons of permutation.
        HashSet<String> result = new HashSet<String>(); // Ask your teacher(!)
        if (input.length() == 1) {
            result.add(input);
            return result; //hash list created.
        } else {
            for (int i = 0; i < input.length(); i++) {
                char letter = input.charAt(i);
                 //System.out.println(letter);
                String newText = input.substring(0, i) + input.substring(i + 1);
                for (String addingPermutation : generatePermutations(newText)) {
                    result.add(letter + addingPermutation);
                }
            }
         //   counter = result.size(); // the size of list is created.
                                    // (this mean is the number of variations are also calculated due to the hashset.)
            return result; //hashset  list created
        }
    }
    public static void permutations(HashSet<String> result){ // this method is using for print variatons without 'list'.
        Iterator itr = result.iterator();
        while (itr.hasNext() ){
            System.out.println(itr.next());
        }
    }

}