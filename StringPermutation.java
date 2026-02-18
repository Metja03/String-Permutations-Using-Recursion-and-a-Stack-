import java.util.*;

public class StringPermutation {

    private static Stack<String> callStack = new Stack<>();
    private static List<String> result = new ArrayList<>();
    
    public static void permuteString(String str, int left, int right) {
        callStack.push(str);
        
        if (left == right) {
            result.add(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permuteString(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
        
        callStack.pop();
    }

    private static String swap(String str, int i, int j) {
        char[] arr = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }

    public static List<String> getPermutations() {
        return result;
    }

    public static Stack<String> getCallStack() {
        return callStack;
    }
}