
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirdsShouldTest {

    @Test
    public void make_ALL_Birds_create_a_Melody() {

        Bird isCaptain = new Sparrow();
        Bird canary = new Canary();

        // TODO add bat, duck and magic potato

        String song = canary.sing()+" "+isCaptain.sing();

        Melody melody = new Melody(song);
        Melody melodyExpected = new Melody("I am the Night Melodious PIO PIO Cuack Cuack Magic potato RULES Chirp Chirp");

        melody.printMelody();

        assertEquals(melodyExpected.melody,melody.melody);
    }

    @Test
    public void make_ALL_Birds_create_a_Melody_BY_list() {

        Bird isCaptain = new Sparrow();
        Bird canary = new Canary();

        // TODO add bat, duck and magic potato

        Melody melody = new Melody();
        melody.createSong(new Bird[] {canary,isCaptain});

        Melody melodyExpected = new Melody("I am the Night Melodious PIO PIO Cuack Cuack Magic potato RULES Chirp Chirp");

        melody.printMelody();

        assertEquals(melodyExpected.melody,melody.melody);
    }

    @Test
    public void make_ALL_birds_teach_Flylessons(){

        Bird isCaptain = new Sparrow();
        Bird canary = new Canary();

        // TODO add bat, duck and magic potato

        String lesson =canary.fly()+" "+isCaptain.fly();
        FlyTime flylesson = new FlyTime(lesson);
        FlyTime flyLessonExpected = new FlyTime("Fliying in the Darkness Flying like a canary Flying more or less rolling potato Flying to steal your Bread");

        flylesson.printFlyLessons();


        assertEquals(flyLessonExpected.flyLesson , flylesson.flyLesson);
    }

    @Test
    public void make_ALL_birds_teach_Flylessons_BY_list(){

        Bird isCaptain = new Sparrow();
        Bird canary = new Canary();

        // TODO add bat, duck and magic potato

        FlyTime flylesson = new FlyTime();
        flylesson.createFlylesson(new Bird[] {canary,isCaptain});

        FlyTime flyLessonExpected = new FlyTime("Fliying in the Darkness Flying like a canary Flying more or less rolling potato Flying to steal your Bread");

        flylesson.printFlyLessons();


        assertEquals(flyLessonExpected.flyLesson , flylesson.flyLesson);
    }

}
