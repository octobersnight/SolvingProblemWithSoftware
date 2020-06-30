package StringFirstAssignment;

import edu.duke.URLResource;

public class Part4Quiz {
    public static void main(String[] args){
        URLResource ur = new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
        for (String item : ur.words()) {
            String itemLower = item.toLowerCase();
            int pos = itemLower.indexOf("youtube.com");
            if (pos != -1) {
                //MISSING CODE
                int beg = itemLower.lastIndexOf("\"",pos);
                int end = itemLower.indexOf("\"", pos+1);
                System.out.println(itemLower.substring(beg+1,end));
            }
        }
    }

    /*
                int beg = item.lastIndexOf("\"",pos);
                int end = item.indexOf("\"", pos+1);
                System.out.println(item.substring(beg+1,end));

     */
}
