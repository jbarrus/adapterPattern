
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class birdsShould {

    @Test
    public void make_ALL_Birds_create_a_Melody() {

        Bird isCaptain = new Sparrow();
        Bird canary = new Canary();

        String song = canary.sing()+" "+isCaptain.sing();

        Melody melody = new Melody(song);
        Melody melodyExpected = new Melody("Melodious PIO PIO Chirp Chirp");

        melody.printMelody();

        assertEquals(melodyExpected.melody,melody.melody);
    }



    @Test
    public void make_ALL_birds_teach_Flylessons(){

        Bird isCaptain = new Sparrow();
        Bird canary = new Canary();

        String lesson =canary.fly()+" "+isCaptain.fly();
        FlyTime flylesson = new FlyTime(lesson);
        FlyTime flyLessonExpected = new FlyTime("Flying like a canary Flying to steal your Bread");

        flylesson.printFlyLessons();

        assertEquals(flyLessonExpected.flyLesson,flylesson.flyLesson);
    }


}
