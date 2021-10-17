package interfaces.task02;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call("123456754");
        phone.call("123423456754");
        phone.call("123");
        phone.call("16754");
        phone.call("123454");
        phone.call("456754");
        phone.callAlarmNumber();
        phone.callAlarmNumber();
        phone.callAlarmNumber();
        phone.callAlarmNumber();
        phone.callAlarmNumber();

        System.out.println(phone.cumulatedCallTime);
    }
}
