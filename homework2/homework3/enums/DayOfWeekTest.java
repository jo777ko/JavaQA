package homework.homework3.enums;

public class DayOfWeekTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorIfVersion dayIf = new DayOfTheWeekDetectorIfVersion();
        dayIf.dayOfWeekDetector(5);
        DayOfTheWeekDetectorSwitchVersion daySw = new DayOfTheWeekDetectorSwitchVersion();
        daySw.dayOfWeekDetector(6);
        DayOfTheWeekDetectorArrayVersion dayAr = new DayOfTheWeekDetectorArrayVersion();
        dayAr.dayOfWeekDetector(3);

    }
}
