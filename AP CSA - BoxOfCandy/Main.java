public class Main {
    public static void main(String[] args) {
        Candy[][] box1 = {
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null}
        };

        box1[0][1] = new Candy("lime");
        box1[1][1] = new Candy("orange");
        box1[2][2] = new Candy("cherry");
        box1[3][1] = new Candy("lemon");
        box1[3][2] = new Candy("grape");

        BoxOfCandy b1 = new BoxOfCandy(box1);
        System.out.println(b1 + "\n");
        System.out.println(b1.moveCandyToFirstRow(0));
        System.out.println(b1.moveCandyToFirstRow(1));
        System.out.println(b1.moveCandyToFirstRow(2));
        System.out.println("\n" + b1 + "\n");

        System.out.println();

        Candy[][] box2 = {
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null}
        };

        box2[0][0] = new Candy("lime");
        box2[0][1] = new Candy("lime");
        box2[0][3] = new Candy("lemon");
        box2[1][0] = new Candy("orange");
        box2[1][3] = new Candy("lime");
        box2[1][4] = new Candy("lime");
        box2[2][0] = new Candy("cherry");
        box2[2][2] = new Candy("lemon");
        box2[2][4] = new Candy("orange");

        BoxOfCandy b2 = new BoxOfCandy(box2);
        System.out.println("\n" + b2 + "\n");
        System.out.println(b2.removeNextByFlavor("cherry"));
        System.out.println(b2.removeNextByFlavor("lime"));
        System.out.println("\n" + b2);
    }
}
