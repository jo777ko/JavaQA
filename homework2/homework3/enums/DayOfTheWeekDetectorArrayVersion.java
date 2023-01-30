package homework.homework3.enums;

import java.util.Arrays;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector{
    protected String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday", "Sunday"};

    @Override
    public void dayOfWeekDetector(int number) {
        if(number > 0 && number < 8) {
            System.out.println(dayOfWeek[number - 1]);
        } else {
            System.out.println("Please input a valid number between 1 and 7");
        }
    }
}
