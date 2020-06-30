package StringSecondAssignment;

public class Part2 {
    public int howMany(String a, String b){
        int result = 0;
        int total = 0;
        int startIndex = 0;

        System.out.println("This is the dna: " + b);

        while (true){
            startIndex = b.indexOf(a, startIndex);
            //System.out.println("This dna is at: " + startIndex);
            if(startIndex == -1){
                break;
            }
            // this line is the create a new start for the loop, the current index plus the length of the a
            startIndex = b.indexOf(a, startIndex) + a.length();
            total++;
        }
        result = total;
        return result; // returning and integer
    }

    public void testHowMany(){
        String a = "aa";
        String b = "atggaatcctcggataataacaacggtatctccacctcaggttcagttaggta";

        System.out.println("There are total of: " + howMany(a,b));
    }
    public static void main(String[] args){
        Part2 p2 = new Part2();
        p2.testHowMany();
    }
}
