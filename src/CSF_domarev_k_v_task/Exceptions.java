package CSF_domarev_k_v_task;

public class Exceptions {

    public static void secondsException(int seconds) throws Exception {
        if (seconds < 0) {
            throw new Exception("entered data is below zero");
        }
    }

    public static void hoursAddException(int n, int hours) throws Exception {
        hours = hours + n;
        while (hours >= Time.MAX_HOURS) {
            hours = hours % 24;
        }
        if (hours < 0) {
            throw new Exception("Hours are under null");
        }
    }

    public static void minutesAddException(int n, int hours, int minutes) throws Exception {
        minutes = minutes + n;
        if (minutes >= Time.MAX_SEC_MIN) {
            hours = hours + (minutes / 60);
            minutes = minutes % 60;
        }
        if (minutes < 0) {
            throw new Exception("Minutes are under null");
        }
    }

    public static void secondsAddException(int deSeconds, int n, int minutes) throws Exception {
        deSeconds = deSeconds + n;
        if (deSeconds >= Time.MAX_SEC_MIN) {
            minutes = minutes + (deSeconds / 60);
            deSeconds = deSeconds % 60;
        }
        if (deSeconds < 0) {
            throw new Exception("Seconds are under null");
        }
    }
}
