package StringSecondAssignment;

/*

2. Copy your methods from Part1 to find one gene and print all genes.

3. Write the method named countGenes that has a String parameter named dna representing a string of DNA.
This method returns the number of genes found in dna.
For example the call countGenes(“ATGTAAGATGCCCTAGT”) returns 2, finding the gene ATGTAA first and then the gene ATGCCCTAG.
Hint: This is very similar to finding all genes and printing them,
except that instead of printing all the genes you will count them.

4. Write the void method named testCountGenes that has no parameters.
This method calls countGenes with many example strings and prints the result for each.
You should create several examples with different numbers of genes to test your code.

 */

public class Part3 {
    /**
     * this method is to find the first occurrence of the stop codon.
     * the dna must be a multiple of 3, if not return empty string.
     */
    public int findStopCodon(String dna, String stopCodon, int startIndex){
        int currentOccurrence = dna.indexOf(stopCodon, startIndex);     /* position of the stopCodon in the dna. */

        if ((currentOccurrence - startIndex)%3 == 0){
            return currentOccurrence;                   /* return the length from the start to the occurrence stop codon */
        } else {
            return dna.length();                        /* return the length of the actual dna strings */
        }
    }

    /**
     *
     */
    public String findGene(String dna, int whereToStart){
        int minIndex = 0;
        String result;

        whereToStart = dna.indexOf("atg", whereToStart);

        if (whereToStart == -1){
            return "";
        }

        // there are more than one type of stop codon
        int taaIndex = findStopCodon(dna, "taa", whereToStart);
        int tgaIndex = findStopCodon(dna, "tga", whereToStart);
        int tagIndex = findStopCodon(dna, "tag", whereToStart);

        //check to see which stop codon is the shortest between taa and tga
        if(taaIndex == -1 || (tgaIndex != -1 && tgaIndex < taaIndex)){
            minIndex = tgaIndex;
        } else {
            minIndex = taaIndex;
        }

        // check to see if which stop codon is the shortest between tag and minIndex
        if (minIndex == -1 || (tagIndex != -1 && tagIndex < minIndex)){
            minIndex = tagIndex;
        }

        if (minIndex == dna.length()){
            return "";
        }

        result = dna.substring(whereToStart, minIndex + 3);
        return result;
    }

    /**
     *
     */
    public void printAllGene(String dna){
        int currentIndex = 0;

        System.out.println(dna);

        while(true){
            String currentGene = findGene(dna, currentIndex);

            if (currentGene.isEmpty()){
                break;
            }

            System.out.println("This is a gene: " + currentGene);
            currentIndex = dna.indexOf(currentGene, currentIndex) + currentGene.length();
        }
    }

    /**
     * testing to see if the finding the stop codon method works.
     * this will also test to see if there are few dna strings with an without stop codon.
     */
    public void testFindStopCodon(){
        int wheretoStart = 0;
        String dna = "atggactcataataa";                                 /* there are 15 characters in this dna */
        System.out.println(findStopCodon(dna, "taa", 0));
        System.out.println("This is the string of dna: " + findGene(dna, wheretoStart));

        String dna2 = "atggaaccattgcgagcatgagacagttaggta";               /* there are no taa in this dna */
        System.out.println(findStopCodon(dna2, "taa", 0));
        System.out.println("This is the string of dna: " + findGene(dna2, wheretoStart));
    }

    /**
     *
     */

    public void testFindGene(){
        int wheretoStart = 0;
        String dna = "atggatcctccatatacaacggtatctcctccatatacaacggtatctccacctcaggtttag" +
                "cacctcaggtttagatctcaacaacggaaccatgccgacatgagacagttag" +
                "gtatcgtcgagaatggatcctccatatacaacggtatctccacctcaggtttagatctcaacaacggaaccatgccgacatgagacagt";

        printAllGene(dna);
    }

    /**
     *
     * @param args
     */

    public static void main(String[] args){
        Part3 p3 = new Part3();
        p3.testFindGene();

    }
}
