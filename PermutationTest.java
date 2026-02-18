

import java.util.*;

public class PermutationTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        StringPermutation permGen = new StringPermutation();
        permGen.permuteString(str, 0, str.length() - 1);
        
        System.out.println("Original String: " + str);
        
        System.out.println("Generated Permutations:");
        for (String perm : StringPermutation.getPermutations()) {
            System.out.println(perm);
        }
        
        System.out.println("Stack Trace of Recursive Calls:");
        while (!StringPermutation.getCallStack().isEmpty()) {
            System.out.println(StringPermutation.getCallStack().peek());
            StringPermutation.getCallStack().pop();
        }
        
        scanner.close();
    }
}
