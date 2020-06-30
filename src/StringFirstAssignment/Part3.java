package StringFirstAssignment;

public class Part3 {
    public static void main(String[] args){
        Part3 p3 = new Part3();
        p3.testing();
    }

    static String twoOccurrence(String a, String b){
        String result;

        // the first occurrence will initial where the start of the index
        int firstOccurrence = b.indexOf(a, 0);
        // the second occurrence will initial after the first occurrence
        int secondOccurrence = b.indexOf(a, firstOccurrence + 1);

        // condition need to be meet if and only if occurrence are greater than -1
        // because if no letter matches the result is -1.
        if (firstOccurrence > -1 && secondOccurrence > -1){
            return "true";
        } else {
            return "false";
        }
    }

    String lastPart(String a, String b){
        String result;
        int findA = b.indexOf(a);
        if (findA == -1){
            return b;
        }
        result = b.substring(findA, b.length());
        return result;
    }

    public void testing(){
        String a, b;
        a = "by";
        b = "a story told by abby long";
        System.out.println(twoOccurrence(a, b));

        a = "atg";
        b = "ttaatgtagcattttagtataccctcagccaacttctct";
        System.out.println(twoOccurrence(a, b));

        a = "atg";
        b = "ttaatgtagcattttagtatgaccctcagccaacttctct";
        System.out.println(twoOccurrence(a, b));

        a = "f";
        b = "wikipedia";
        System.out.println(lastPart(a, b));
    }
}
