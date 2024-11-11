public class AppointmentBook {
    private boolean[][] schedule;

    public AppointmentBook(boolean[][] schedule) {
        this.schedule = schedule;
    }
    
    private boolean isMinuteFree(int period, int minute) {
        return schedule[period - 1][minute];
    }

    private void reserveBlock(int period, int startMin, int duration) {
        for (int i = startMin; i <= startMin + duration; i++) {
            schedule[period - 1][i] = false;
        }
    }

    public int findFreeBlock(int period, int duration) {
        int blockLen = 0;

        for (int i = 0; i < 60; i++) {
            if (isMinuteFree(period, i)) {
                blockLen++;

                if (blockLen == duration) {
                    return i - blockLen + 1;
                }
            } else blockLen = 0;
        }

        return -1;
    }

    public boolean makeAppointment(int startPeriod, int endPeriod, int duration) {
        int appointmentPeriod = 0, appointmentMin = 0;
        boolean booked = false;


        for (int i = startPeriod; i <= endPeriod; i++) {
            if (findFreeBlock(i, duration) != -1) {
                appointmentPeriod = i;
                appointmentMin = findFreeBlock(i, duration);
                booked = true;
                break;
            }
        }

        if (booked) reserveBlock(appointmentPeriod, appointmentMin, duration);

        return booked;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Period  Minute  Available\n");

        for (int period = 0; period < 8; period++) {
            boolean available = schedule[period][0];
            int startMin = 0;

            for (int minute = 1; minute < 60; minute++) {
                if (schedule[period][minute] != available) {
                    int endMin = minute - 1;
                    int duration = endMin - startMin + 1;
                    result.append(String.format("%d %d - %d (%d minutes) %s\n",
                            period, startMin, endMin, duration, available ? "Yes" : "No"));
                    startMin = minute;
                    available = schedule[period][minute];
                }
            }

            int endMin = 59;
            int duration = endMin - startMin + 1;
            result.append(String.format("%d %d - %d (%d minutes) %s\n",
                    period, startMin, endMin, duration, available ? "Yes" : "No"));
        }

        return result.toString();
    }
}