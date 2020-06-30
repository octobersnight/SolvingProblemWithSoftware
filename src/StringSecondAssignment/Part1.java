package StringSecondAssignment;

public class Part1 {
    public static void main(String[] args){
        String dna = " atggatcctccatatacaacggtatctccacctcaggtttagatctcaacaacggaaccattgccgacatgagacagttaggtatcgtcgagagttacaagctaaaacgagcagtagtcagctctgcatctgaagccgctgaagttctactaagggtggataacatcatccgtgcaagaccaagaaccgccaatagacaacatatgtaacatatttaggatatacctcgaaaataataaaccgccacactgtcattattataattagaaacagaacgcaaaaattatccactatataattcaaagacgcgaaaaaaaaagaacaacgcgtcatagaacttttggcaattcgcgtcacaaataaattttggcaacttatgtttcctcttcgagcagtactcgagccctgtctcaagaatgtaataatacccatcgtaggtatggttaaagatagcatctccacaacctcaaagctccttgccgagagtcgccctcctttgtcgagtaattttcacttttcatatgagaacttattttcttattctttactctcacatcctgtagtgattgacactgcaacagccaccatcactagaagaacagaacaattacttaatagaaaaattatatcttcctcgaaacgatttcctgcttccaacatctacgtatatcaagaagcattcacttaccatgacacagcttcagatttcattattgctgacagctactatatcactactccatctagtagtggccacgccctatgaggcatatcctatcggaaaacaataccccccagtggcaagagtcaatgaatcgtttacatttcaaatttccaatgatacctataaatcgtctgtagacaagacagctcaaataacatacaattgcttcgacttaccgagctggctttcgtttgactctagttctagaacgttctcaggtgaaccttcttctgacttactatctgatgcgaacaccacgttgtatttcaatgtaatactcgagggtacggactctgccgacagcacgtctttgaacaatacataccaatttgttgttacaaaccgtccatccatctcgctatcgtcagatttcaatctattggcgttgttaaaaaactatggttatactaacggcaaaaacgctctgaaactagatcctaatgaagtcttcaacgtgacttttgaccgttcaatgttcactaacgaagaatccattgtgtcgtattacggacgttctcagttgtataatgcgccgttacccaattggctgttcttcgattctggcgagttgaagtttactgggacggcaccggtgataaactcggcgattgctccagaaacaagctacagttttgtcatcatcgctacagacattgaaggattttctgccgttgaggtagaattcgaattagtcatcggggctcaccagttaactacctctattcaaaatagtttgataatcaacgttactgacacaggtaacgtttcatatgacttacctctaaactatgtttatctcgatgacgatcctatttcttctgataaattgggttctataaacttattggatgctccagactgggtggcattagataatgctaccatttccgggtctgtcccagatgaattactcggtaagaactccaatcctgccaatttttctgtgtccatttatgatacttatggtgatgtgatttatttcaacttcgaagttgtctccacaacggatttgtttgccattagttctcttcccaatattaacgctacaaggggtgaatggttctcctactattttttgccttctcagtttacagactacgtgaatacaaacgtttcattagagtttactaattcaagccaagaccatgactgggtgaaattccaatcatctaatttaacattagctggagaagtgcccaagaatttcgacaagctttcattaggtttgaaagcgaaccaaggttcacaatctcaagagctatattttaacatcattggcatggattcaaagataactcactcaaaccacagtgcgaatgcaacgtccacaagaagttctcaccactccacctcaacaagttcttacacatcttctacttacactgcaaaaatttcttctacctccgctgctgctacttcttctgctccagcagcgctgccagcagccaataaaacttcatctcacaataaaaaagcagtagcaattgcgtgcggtgttgctatcccattaggcgttatcctagtagctctcatttgcttcctaatattctggagacgcagaagggaaaatccagacgatgaaaacttaccgcatgctattagtggacctgatttgaataatcctgcaaataaaccaaatcaagaaaacgctacacctttgaacaacccctttgatgatgatgcttcctcgtacgatgatacttcaatagcaagaagattggctgctttgaacactttgaaattggataaccactctgccactgaatctgatatttccagcgtggatgaaaagagagattctctatcaggtatgaatacatacaatgatcagttccaatcccaaagtaaagaagaattattagcaaaacccccagtacagcctccagagagcccgttctttgacccacagaataggtcttcttctgtgtatatggatagtgaaccagcagtaaataaatcctggcgatatactggcaacctgtcaccagtctctgatattgtcagagacagttacggatcacaaaaaactgttgatacagaaaaacttttcgatttagaagcaccagagaaggaaaaacgtacgtcaagggatgtcactatgtcttcactggacccttggaacagcaatattagcccttctcccgtaagaaaatcagtaacaccatcaccatataacgtaacgaagcatcgtaaccgccacttacaaaatattcaagactctcaaagcggtaaaaacggaatcactcccacaacaatgtcaacttcatcttctgacgattttgttccggttaaagatggtgaaaatttttgctgggtccatagcatggaaccagacagaagaccaagtaagaaaaggttagtagatttttcaaataagagtaatgtcaatgttggtcaagttaaggacattcacggacgcatcccagaaatgctgtgattatacgcaacgatattttgcttaattttattttcctgttttattttttattagtggtttacagataccctatattttatttagtttttatacttagagacatttaattttaattccattcttcaaatttcatttttgcacttaaaacaaagatccaaaaatgctctcgccctcttcatattgagaatacactccattcaaaattttgtcgtcaccgctgattaatttttcactaaactgatgaataatcaaaggccccacgtcagaaccgactaaagaagtgagttttattttaggaggttgaaaaccattattgtctggtaaattttcatcttcttgacatttaacccagtttgaatccctttcaatttctgctttttcctccaaactatcgaccctcctgtttctgtccaacttatgtcctagttccaattcgatcgcattaataactgcttcaaatgttattgtgtcatcgttgactttaggtaatttctccaaatgcataatcaaactatttaaggaagatcggaattcgtcgaacacttcagtttccgtaatgatctgatcgtctttatccacatgttgtaattcactaaaatctaaaacgtatttttcaatgcataaatcgttctttttattaataatgcagatggaaaatctgtaaacgtgcgttaatttagaaagaacatccagtataagttcttctatatagtcaattaaagcaggatgcctattaatgggaacgaactgcggcaagttgaatgactggtaagtagtgtagtcgaatgactgaggtgggtatacatttctataaaataaaatcaaattaatgtagcattttaagtataccctcagccacttctctacccatctattcataaagctgacgcaacgattactattttttttttcttcttggatctcagtcgtcgcaaaaacgtataccttctttttccgaccttttttttagctttctggaaaagtttatattagttaaacagggtctagtcttagtgtgaaagctagtggtttcgattgactgatattaagaaagtggaaattaaattagtagtgtagacgtatatgcatatgtatttctcgcctgtttatgtttctacgtacttttgatttatagcaaggggaaaagaaatacatactattttttggtaaaggtgaaagcataatgtaaaagctagaataaaatggacgaaataaagagaggcttagttcatcttttttccaaaaagcacccaatgataataactaaaatgaaaaggatttgccatctgtcagcaacatcagttgtgtgagcaataataaaatcatcacctccgttgcctttagcgcgtttgtcgtttgtatcttccgtaattttagtcttatcaatgggaatcataaattttccaatgaattagcaatttcgtccaattctttttgagcttcttcatatttgctttggaattcttcgcacttcttttcccattcatctctttcttcttccaaagcaacgatccttctacccatttgctcagagttcaaatcggcctctttcagtttatccattgcttccttcagtttggcttcactgtcttctagctgttgttctagatcctggtttttcttggtgtagttctcattattagatctcaagttattggagtcttcagccaattgctttgtatcagacaattgactctctaacttctccacttcactgtcgagttgctcgtttttagcggacaaagatttaatctcgttttctttttcagtgttagattgctctaattctttgagctgttctctcagctcctcatatttttcttgccatgactcagattctaattttaagctattcaatttctctttgatc";

        Part1 p1 = new Part1();
        //p1.testFindStopCodon();
        //p1.testFindGene();
        p1.printAllGene(dna);
    }

    //This method returns the index of the first occurrence of stopCodon that appears past startIndex
    // and is a multiple of 3 away from startIndex. If there is no such stopCodon,
    // this method returns the length of the dna strand.
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

    //5. Write the method findGene that has one String parameter dna, representing a string of DNA.
    String findGene(String dna, int where){
        // variables
        int minIndex = 0;
        //Find the index of the first occurrence of the start codon “ATG”. If there is no “ATG”, return the empty string.
        int startCodon = dna.indexOf("atg", where);
        if (startCodon == -1){
            return "";
        }
        //Find the index of the first occurrence of the stop codon “TAA”
        // after the first occurrence of “ATG” that is a multiple of three away from the “ATG”. Hint: call findStopCodon.
        int taa = findStopCodon(dna, "taa", startCodon);
        //Find the index of the first occurrence of the stop codon “TAG”
        // after the first occurrence of “ATG” that is a multiple of three away from the “ATG”.);
        int tag = findStopCodon(dna, "tag", startCodon);
        // Find the index of the first occurrence of the stop codon “TGA”
        // after the first occurrence of “ATG” that is a multiple of three away from the “ATG”.;
        int tga = findStopCodon(dna, "tga", startCodon);
        //Return the gene formed from the “ATG” and the closest stop codon that is a multiple of three away.
        // If there is no valid stop codon and therefore no gene, return the empty string.
        // reference to java doc for Math.min
        /*
        int minTemp = Math.min(taa, tag);
        int minIndex = Math.min(tga, minTemp);
        */
        if (taa == -1 || (tga != -1 && tga < taa)){
            minIndex = tga;
        } else {
            minIndex = taa;
        }

        if (minIndex == -1 || (tag != -1 && tag < minIndex)){
            minIndex = tag;
        }

        if (minIndex == dna.length()){
            return "";
        }

        String result = dna.substring(startCodon, minIndex + 3);
        return result;
    }

    public void testFindStopCodon(){
        String dna = "atggatcctcggataataacaacggtatctccacctcaggtttaagatctcaacaacggaaccattgccgacatgagacagttaggta";
        System.out.println(findStopCodon(dna, "taa", 0));
        //System.out.println(findGene(dna));

        String dna2 = "atggatcctcgaacggtatctccacctcaggtttagatctcaacaacggaaccattgccgacatgagacagttaggta";
        System.out.println(findStopCodon(dna2, "tga", 0));
        //System.out.println(findGene(dna2));

        String dna3 = "atggatcctcggataataacacggtgatctccacctcaggtttagatctcaacaacggaaccattgccgacatgagacagttaggta";
        System.out.println(findStopCodon(dna3, "tag", 0));
        //System.out.println(findGene(dna3));
    }

    public void testFindGene(){
        String dna = "agatcctcggataatacaa"; // dna with taa, no atg
        System.out.println(dna);
        //System.out.println(findGene(dna));

        String dna2 = "atggatccactcggataataacaa"; // dna with atg and taa
        System.out.println(dna2);
        //System.out.println(findGene(dna2));

        String dna3 = "atggatcctcggataataacaacggtatctccacctcaggttcagttaggta"; // multiple stop codon
        System.out.println(dna3);
        //System.out.println(findGene(dna3));

        String dna4 = "atggatccactcggatatacaa"; // dna with atg, no stop codon
        System.out.println(dna4);
        //System.out.println(findGene(dna4));
    }

    public void printAllGene(String dna){
        int startIndex = 0;
        System.out.println(dna);
        while(true){
            String currentGene = findGene(dna, startIndex);

            if (currentGene.isEmpty()){
                break;
            }
            System.out.println(currentGene);
            startIndex = dna.indexOf(currentGene, startIndex) + currentGene.length();
        }


    }

}
