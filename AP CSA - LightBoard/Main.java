public class Main {
    public static void main(String[] args) {
        LightBoard lb = new LightBoard(7, 5);

        System.out.println(lb);
        System.out.println(lb.evaluateLight(0, 3));
        System.out.println(lb.evaluateLight(6, 0));
        System.out.println(lb.evaluateLight(4, 1));
        System.out.println(lb.evaluateLight(5, 4));
    }
}
