import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strList1 = new ArrayList<String>();
        strList1.add("an");
        strList1.add("band");
        strList1.add("band");
        strList1.add("abandon");

        ArrayList<String> strList2 = new ArrayList<String>();
        strList2.add("to");
        strList2.add("too");
        strList2.add("stool");
        strList2.add("tools");

        ArrayList<String> strList3 = new ArrayList<String>();
        strList3.add("catch");
        strList3.add("bobcat");
        strList3.add("catchacat");
        strList3.add("cat");
        strList3.add("at");

        WordChecker wc1 = new WordChecker(strList1);
        WordChecker wc2 = new WordChecker(strList2);
        WordChecker wc3 = new WordChecker(strList3);
        
        System.out.println(wc1.isWordChain());
        System.out.println(wc2.isWordChain());
        System.out.println(wc3.createList("cat").toString());
        System.out.println(wc3.createList("catch").toString());
        System.out.println(wc3.createList("dog").toString());
    }
}
