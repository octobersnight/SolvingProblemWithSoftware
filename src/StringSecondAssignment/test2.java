package StringSecondAssignment;

public class test2 {
    public static void main(String[] args){
        // && and || have special rules
        // - "Short circuit evaluation": if java can figure out the answer from one operand, it does not evaluate the other
        String s = "duke";
        int x = 3;

        if (x <= s.length() || s.charAt(x) == 'k'){
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}
