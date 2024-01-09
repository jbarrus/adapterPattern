package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirdsShouldTest {

    @Test
    public void make_ALL_Birds_create_a_Melody_BY_list() {
        Bird sparrow = new Sparrow();
        Bird canary = new Canary();

        Melody melody = new Melody();
        // TODO add bat, canary, duck, potato, sparrow
        melody.createSong(new Bird[]{canary, sparrow});

        Melody melodyExpected = new Melody("I am the Night Melodious PIO PIO Cuack Cuack Magic potato RULES Chirp Chirp");

        melody.printMelody();

        assertEquals(melodyExpected.melody, melody.melody);
    }

    @Test
    public void make_ALL_birds_teach_Flylessons_BY_list() {
        Bird sparrow = new Sparrow();
        Bird canary = new Canary();

        FlyTime flylesson = new FlyTime();
        // TODO list should have bat, canary, potato, sparrow, duck
        flylesson.createFlylesson(new Bird[]{canary, sparrow});

        FlyTime flyLessonExpected = new FlyTime("Fliying in the Darkness Flying like a canary Flying more or less rolling potato Flying to steal your Bread");

        flylesson.printFlyLessons();

        assertEquals(flyLessonExpected.flyLesson, flylesson.flyLesson);
    }

}
