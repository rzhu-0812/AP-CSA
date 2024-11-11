public class Main {
    public static void main(String[] args) {
        boolean[][] scheduleOne = new boolean[8][60];

        for (int i = 10; i < 15; i++) scheduleOne[1][i] = true;
        for (int i = 30; i < 45; i++) scheduleOne[1][i] = true;
        for (int i = 50; i < 60; i++) scheduleOne[1][i] = true;

        AppointmentBook abOne = new AppointmentBook(scheduleOne);

        System.out.println(abOne);

        System.out.println(abOne.findFreeBlock(2, 15));
        System.out.println(abOne.findFreeBlock(2, 9));
        System.out.println(abOne.findFreeBlock(2, 20));
        

        boolean[][] scheduleTwo = new boolean[8][60];

        for (int i = 25; i < 30; i++) scheduleTwo[1][i] = true;
        for (int i = 0; i < 15; i++) scheduleTwo[2][i] = true;
        for (int i = 41; i < 60; i++) scheduleTwo[2][i] = true;
        for (int i = 5; i < 30; i++) scheduleTwo[3][i] = true;
        for (int i = 44; i < 60; i++) scheduleTwo[3][i] = true;

        AppointmentBook abTwo = new AppointmentBook(scheduleTwo);

        System.out.println(abTwo);
        
        System.out.println(abTwo.makeAppointment(2, 4, 22));
        System.out.println(abTwo.makeAppointment(3, 4, 3));
        System.out.println(abTwo.makeAppointment(2, 4, 30));

        System.out.println(abTwo);
    }
}
