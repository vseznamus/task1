package CSF_domarev_k_v_task;

public class Exceptions extends RuntimeException {

    public static void secondsException() {
        throw new RuntimeException("entered data is below zero");
    }

    public static void hoursAddException() {
        throw new RuntimeException("Hours are under null");
    }

    public static void minutesAddException() {
        throw new RuntimeException("Minutes are under null");
    }

    public static void secondsAddException() {
        throw new RuntimeException("Seconds are under null");
    }
}
