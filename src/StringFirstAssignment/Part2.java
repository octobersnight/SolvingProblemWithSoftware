package StringFirstAssignment;

public class Part2 {
    public static void main(String[] args){
        String dna_String, dna_String2, dna_String3, dna_String4, startOfCodon, endOfCodon;

        dna_String = "ctccatgatacaacggatatctccacctcaggtttaagatctcaacaacggaaccattgccgacatgagacagt";
        dna_String2 = "aatactgaggtgggtatacatttctataaaataaaatcaaaattaagtagcattttaagtataccctcagccacttctct";
        dna_String3 = "ttaatgtagcattttagtataccctcagccaacttctct";
        dna_String4 = "gcattttagtataccctcagccactttctct";

        startOfCodon = "atg";
        endOfCodon = "taa";

        System.out.println(dna_String);
        testStringDNA(dna_String, startOfCodon, endOfCodon);

        System.out.println(dna_String2);
        testStringDNA(dna_String2, startOfCodon, endOfCodon);

        System.out.println(dna_String3);
        testStringDNA(dna_String3, startOfCodon, endOfCodon);

        System.out.println(dna_String4);
        testStringDNA(dna_String4, startOfCodon, endOfCodon);
    }

    public static String findSimpleGene(String dna, String sCodon, String eCodon){
        String result= null;
        int startCodon = 0, endCodon = 0;

        startCodon = dna.indexOf(sCodon, 0);
        endCodon = dna.indexOf(eCodon, startCodon + 3);
        if (startCodon == -1 && endCodon == -1){
            return "There is no starting or ending codon.";
        } else if (endCodon == -1){
            return "There is no ending codon. ";
        } else if (startCodon == -1){
            return "There is no starting codon. ";
        }

        result = dna.substring(startCodon, endCodon + 3);
        return result.toUpperCase();
    }

    public static void testStringDNA(String dna, String sCodon, String eCodon){
        int string_Count = 0, result_Count = 0;
        string_Count = findSimpleGene(dna, sCodon, eCodon).length();
        result_Count = string_Count % 3;
        System.out.println("result of the string dna: " + findSimpleGene(dna, sCodon, eCodon));

        if (result_Count == 0){
            System.out.println("The string is a multiple of 3. ");
        } else {
            System.out.println("The string is not a multiple of 3. ");
        }

    }
}
