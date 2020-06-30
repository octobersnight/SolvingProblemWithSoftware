package StringFirstAssignment;

public class Test {
    public static void main(String[] args){
        String result = null;
        int num_Result = 0;
        boolean truFalse;
        String s = "dukeprogramming";

        // the substring will only print out 3 letter,
        // the beginning of the index and the one before the end of the index.
        // 7 -4 = 3, it will only print 3 letter
        result = s.substring(4, 7);
        System.out.println("Substring method: " + result);
        // output is pro

        // display the number of letters in the string
        num_Result = s.length();
        System.out.println("length method: " + num_Result);
        // output is 15

        // find one string in another string, return the index of the starting string
        // if the desire string is not found, return index is -1
        num_Result = s.indexOf("program");
        System.out.println("index method: " + num_Result);
        // output is 4

        num_Result = s.indexOf("f");
        System.out.println("index method: " + num_Result);
        // output is -1

        // the second parameter specifying where the index to start searching from
        num_Result = s.indexOf("g", 8);
        System.out.println("index method with starting index: " + num_Result);
        // output is 14

        // check if the starting string is true or false
        truFalse = s.startsWith("duke");
        System.out.println("startWith method: " + truFalse);
        // output is true

        // check if the starting string is true or false
        truFalse = s.endsWith("king");
        System.out.println("endsWith method: " + truFalse);
        // output is true
    }
}
