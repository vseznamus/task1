package CSF_domarev_k_v_task;

import static CSF_domarev_k_v_task.Exceptions.*;

class Time {

    private static final int MAX_HOURS = 24;
    private static final int MAX_SEC = 60;
    private static final int MAX_MIN = 60;

    private int seconds;
    private int minutes;
    private int hours;
    private int deSeconds;

    Time(int seconds) {
        this.seconds = seconds;
        deSeconds = seconds;

        if (seconds < 0) {
            secondsException();
        }

        secondsInMinutesAndHours();
    }

    public int showTimeDifference(Time now, Time now2) {
        return now.seconds - now2.seconds;
    }

    private void secondsInMinutesAndHours() {
        hours = deSeconds / 3600;

        if (hours >= Time.MAX_HOURS)
            hours = hours % 24;

        minutes = (deSeconds - hours * 3600) / 60;
        deSeconds = deSeconds - hours * 3600 - minutes * 60;
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

    public String getStringTime() {
        return (Integer.toString(hours) + ":" + Integer.toString(minutes) + ":" + Integer.toString(deSeconds));
    }

    public int addReduceHours(int n) {
        hours = hours + n;

        while (hours >= Time.MAX_HOURS) {
            hours = hours % 24;
        }

        if (hours < 0) {
            hoursAddException();
        }

        return hours;
    }

    public int addReduceMinutes(int n) {
        minutes = minutes + n;

        if (minutes >= Time.MAX_MIN) {
            hours = hours + (minutes / 60);
            minutes = minutes % 60;
        }

        if (minutes < 0) {
            minutesAddException();
        }

        return minutes;
    }

    public int addReduceSeconds(int n) {
        deSeconds = deSeconds + n;

        if (deSeconds >= Time.MAX_SEC) {
            minutes = minutes + (deSeconds / 60);
            deSeconds = deSeconds % 60;
        }

        if (deSeconds < 0) {
            secondsAddException();
        }

        return deSeconds;
    }

}
