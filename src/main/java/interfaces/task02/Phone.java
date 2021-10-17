package interfaces.task02;

import java.util.Random;

public class Phone implements Calling {
    protected String phoneNumber;
    protected int cumulatedCallTime;


    @Override
    public void call(String phoneNumber) {
        Random random = new Random();


        if (random.nextInt(2) > 0) {
            System.out.println("NOT CONNECTED");
        } else {
            System.out.println("Connected to " + phoneNumber);
            int callTime = random.nextInt(60)+1;
            this.cumulatedCallTime +=callTime;
            System.out.println("call last "+ callTime);
        }


    }

    @Override
    public void callAlarmNumber() {
        call(Calling.alarmNumber);
    }
}
