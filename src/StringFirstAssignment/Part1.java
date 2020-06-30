package StringFirstAssignment;

public class Part1 {
    public static void main(String[] args){
        String dna_String, dna_String2, dna_String3, dna_String4;

        dna_String = "ctccatgatacaacggatatctccacctcaggtttaagatctcaacaacggaaccattgccgacatgagacagt";
        dna_String2 = "aatactgaggtgggtatacatttctataaaataaaatcaaaattaagtagcattttaagtataccctcagccacttctct";
        dna_String3 = "ttaatgtagcattttagtataccctcagccaacttctct";
        dna_String4 = "gcattttagtataccctcagccactttctct";

        System.out.println(dna_String);
        testStringDNA(dna_String);

        System.out.println(dna_String2);
        testStringDNA(dna_String2);

        System.out.println(dna_String3);
        testStringDNA(dna_String3);

        System.out.println(dna_String4);
        testStringDNA(dna_String4);
    }

    public static String findSimpleGene(String dna){
        String result= null;
        int startCodon = 0, endCodon = 0;

        startCodon = dna.indexOf("atg", 0);
        endCodon = dna.indexOf("taa", startCodon + 3);
        if (startCodon == -1 && endCodon == -1){
            return "There is no starting or ending codon.";
        } else if (endCodon == -1){
            return "There is no ending codon. ";
        } else if (startCodon == -1){
            return "There is no starting codon. ";
        }

        result = dna.substring(startCodon, endCodon + 3);
        return result;
    }

    public static void testStringDNA(String dna){
        int string_Count = 0, result_Count = 0;
        string_Count = findSimpleGene(dna).length();
        result_Count = string_Count % 3;
        System.out.println("result of the string dna: " + findSimpleGene(dna));

        if (result_Count == 0){
            System.out.println("The string is a multiple of 3. ");
        } else {
            System.out.println("The string is not a multiple of 3. ");
        }

    }
}
