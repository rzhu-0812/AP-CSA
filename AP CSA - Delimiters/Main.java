import java.util.ArrayList;public class Main {
    public static void main(String[] args) {
        Delimiters d1 = new Delimiters("(", ")");
        String[] ex1 = {"(", "x + y", ")", " * 5"};
        System.out.println(d1.getDelimitersList(ex1));

        Delimiters d2 = new Delimiters("<q>", "</q>");
        String[] ex2 = {"<q>", "yy", "</q>", "zz", "</q>"};
        System.out.println(d2.getDelimitersList(ex2));

        Delimiters d3 = new Delimiters("<sup>", "</sup>");

        ArrayList<String> ex3 = new ArrayList<>();
        ex3.add("<sup>");
        ex3.add("<sup>");
        ex3.add("</sup>");
        ex3.add("<sup>");
        ex3.add("</sup>");
        ex3.add("</sup>");

        ArrayList<String> ex4 = new ArrayList<>();
        ex4.add("<sup>");
        ex4.add("</sup>");
        ex4.add("</sup>");
        ex4.add("<sup>");

        ArrayList<String> ex5 = new ArrayList<>();
        ex5.add("</sup>");

        ArrayList<String> ex6 = new ArrayList<>();
        ex6.add("<sup>");
        ex6.add("<sup>");
        ex6.add("</sup>");

        System.out.println(d3.isBalanced(ex3));
        System.out.println(d3.isBalanced(ex4));
        System.out.println(d3.isBalanced(ex5));
        System.out.println(d3.isBalanced(ex6));
    }
}
