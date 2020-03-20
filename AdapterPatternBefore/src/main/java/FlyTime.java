import java.util.List;

public class FlyTime {

    String flyLesson;


    public FlyTime(String flyLesson) {
        this.flyLesson = flyLesson;
    }

    public FlyTime() {
        flyLesson = "";
    }

    public void printFlyLessons (){

        System.out.println(flyLesson);
    }

    public String createFlylesson (Bird[] teacherBirds){
        for (Bird bird : teacherBirds ) {
            flyLesson += bird.fly()+" ";
        }
        return flyLesson;
    }


}