package StringSecondAssignment;

public class Test {
    public static void main(String[] args){
        Test test = new Test();
        test.testFindStopCodon();
    }
    // creating a method call findStopCodon with three parameter
    // two string called dna and stopCodon, one integer name start index
    // the return method is an integer
    static int findStopCodon(String dna, String stopCodon, int startIndex){
       // creating statement for the first occurrence of stop codon
        int occurStopCodon = dna.indexOf(stopCodon, startIndex + 3);
        // check if there is a stop codon
        if ((occurStopCodon - startIndex)%3 == 0 ){
            return occurStopCodon;
        } else {
            return dna.length();
        }
    }

    public void testFindStopCodon(){
        String dna = "atggatcctcggataataacaacggtatctccacctcaggtttaagatctcaacaacggaaccattgccgacatgagacagttaggta";
        System.out.println(findStopCodon(dna, "taa", 0));

        String dna2 = "atggatcctcggataataacaacggtatctccacctcaggtttagatctcaacaacggaaccattgccgacatgagacagttaggta";
        System.out.println(findStopCodon(dna2, "tga", 0));

        String dna3 = "atggatcctcggataataacaacggtatctccacctcaggtttagatctcaacaacggaaccattgccgacatgagacagttaggta";
        System.out.println(findStopCodon(dna3, "tag", 0));
    }

}
