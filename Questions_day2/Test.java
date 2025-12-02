public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        String[] ops1 = {"5", "2", "C", "D", "+"};
        System.out.println("Test 1: " + solution.calPoints(ops1));
        
        // Test case 2
        String[] ops2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println("Test 2: " + solution.calPoints(ops2));
        
        // Test case 3
        String[] ops3 = {"1"};
        System.out.println("Test 3: " + solution.calPoints(ops3));
    }
}
