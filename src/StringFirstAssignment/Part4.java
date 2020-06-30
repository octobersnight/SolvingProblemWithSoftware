package StringFirstAssignment;

import edu.duke.URLResource;

public class Part4 {
    public static void main(String[] args){
        String checkWords = "youtube.com";
        URLResource ur = new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
        for (String s : ur.lines()){
            String lowerCaseWord = s.toLowerCase();
            int findWork = lowerCaseWord.indexOf(checkWords);
            if (findWork != -1){
                int beg = lowerCaseWord.lastIndexOf("\"", findWork);
                int end = lowerCaseWord.indexOf("\"", findWork + 1);
                System.out.println(lowerCaseWord.substring(beg + 1, end));
            }
        }
    }
}
