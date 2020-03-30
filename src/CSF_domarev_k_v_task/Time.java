package CSF_domarev_k_v_task;

class Time {

    public static final int MAX_HOURS = 24;
    public static final int MAX_SEC_MIN = 60;

    private int seconds;
    private int minutes;
    private int hours;
    private int deSeconds;

    Time(int seconds) throws Exception {
        this.seconds = seconds;
        deSeconds = seconds;
        Exceptions.secondsException(seconds);
        secondsInMinutesAndHours();
    }

    public static int timeDifference(Time now, Time now2) {
        return now.seconds - now2.seconds;
    }

    private void secondsInMinutesAndHours() {
        while (deSeconds >= MAX_SEC_MIN) {

            minutes = minutes + (deSeconds / 60);
            deSeconds = deSeconds % 60;

            if (minutes >= MAX_SEC_MIN) {
                hours = hours + (minutes / 60);
                minutes = minutes % 60;
            }

            while (hours >= MAX_HOURS) {
                hours = hours % 24;
            }

        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return deSeconds;
    }

    public String getFullTimeInFormat() {
        return (Integer.toString(hours) + ":" + Integer.toString(minutes) + ":" + Integer.toString(deSeconds));
    }

    public int addReduceHours(int n) throws Exception {
        Exceptions.hoursAddException(n, hours);
        return hours;
    }

    public int addReduceMinutes(int n) throws Exception {
        Exceptions.minutesAddException(n, hours, minutes);
        return minutes;
    }

    public int addReduceSeconds(int n) throws Exception {
        Exceptions.secondsAddException(deSeconds, n, minutes);
        return deSeconds;
    }

}
