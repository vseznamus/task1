package CSF_domarev_k_v_task;


public class Main {

    public static void main(String[] args) {
        Time now = new Time(843838);
        Time now2 = new Time(4444);

        now.getStringTime();

        int nowSecond = now.getSeconds();

        int nowMinute = now.getMinutes();

        int nowHour = now.getHours();

        int addHours = now.addReduceHours(8);

        int addMinutes = now.addReduceMinutes(10);

        int addSeconds = now.addReduceSeconds(72);

        int timeDifference = now2.showTimeDifference(now, now2);
    }
}
