import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strList1 = new ArrayList<String>() {{
            add("an");
            add("band");
            add("band");
            add("abandon");
        }};

        ArrayList<String> strList2 = new ArrayList<String>() {{
            add("to");
            add("too");
            add("stool");
            add("tools");
        }};

        ArrayList<String> strList3 = new ArrayList<String>() {{
            add("catch");
            add("bobcat");
            add("catchacat");
            add("cat");
            add("at");
        }};

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
