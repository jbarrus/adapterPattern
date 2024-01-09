package kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class FlyTime {

    String flyLesson;

    public FlyTime(String flyLesson) {
        this.flyLesson = flyLesson;
    }

    public FlyTime() {
        flyLesson = "";
    }

    public void printFlyLessons() {

        System.out.println(flyLesson);
    }

    public String createFlylesson(Bird[] teacherBirds) {
        flyLesson = Arrays.stream(teacherBirds).map(Bird::fly).collect(Collectors.joining(" "));
        return flyLesson;
    }

}