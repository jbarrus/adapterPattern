import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class birdsShould {

    @Test
    public void make_ALL_Birds_create_a_Melody() {

        Bird isCaptain = new Sparrow();
        Bird canary = new Canary();

        Bird batsy = new Bat_Adapter(new Bat());
        Bird donald = new Duck_Adapter(new Duck());
        Bird potato = new MagicPotato_Adapter(new MagicPotato());

        String song = batsy.sing()+" "+canary.sing()+" "+donald.sing()+" "+potato.sing()+" "+isCaptain.sing();

        Melody melody = new Melody(song);
        Melody melodyExpected = new Melody("I am the Night Melodious PIO PIO Cuack Cuack Magic potato RULES Chirp Chirp");

        melody.printMelody();

        assertEquals(melodyExpected.melody,melody.melody);
    }



    @Test
    public void make_ALL_birds_teach_Flylessons(){
        Bird isCaptain = new Sparrow();
        Bird canary = new Canary();

        Bird batsy = new Bat_Adapter(new Bat());
        Bird donald = new Duck_Adapter(new Duck());
        Bird potato = new MagicPotato_Adapter(new MagicPotato());

        String lesson = batsy.fly()+" "+canary.fly()+" "+donald.fly()+" "+potato.fly()+" "+isCaptain.fly();
        FlyTime flylesson = new FlyTime(lesson);
        FlyTime flyLessonExpected = new FlyTime("Fliying in the Darkness  Flying like a canary Flying more or less rolling potato Flying to steal your Bread");

        flylesson.printFlyLessons();


        assertEquals(flyLessonExpected.flyLesson , flylesson.flyLesson);
    }

    @Test
    public void create_a_Melody() {

        Bird isCaptain = new Sparrow();
        Bird canary = new Canary();

        Bird batsy = new Bat_Adapter(new Bat());
        Bird donald = new Duck_Adapter(new Duck());
        Bird potato = new MagicPotato_Adapter(new MagicPotato());

        Melody melody = new Melody();
        Melody melodyExpected = new Melody("I am the Night Melodious PIO PIO Cuack Cuack Magic potato RULES Chirp Chirp");

        assertEquals( melody.createSong(new Bird[]{isCaptain, canary, batsy, donald, potato}),melody.melody);
    }



    @Test
    public void teach_Flylessons(){
        Bird isCaptain = new Sparrow();
        Bird canary = new Canary();

        Bird batsy = new Bat_Adapter(new Bat());
        Bird donald = new Duck_Adapter(new Duck());
        Bird potato = new MagicPotato_Adapter(new MagicPotato());

        FlyTime flylesson = new FlyTime();
        FlyTime flyLessonExpected = new FlyTime("Fliying in the Darkness  Flying like a canary Flying more or less rolling potato Flying to steal your Bread ");

        assertEquals(flyLessonExpected.flyLesson , flylesson.createFlylesson(new Bird [] {batsy,canary,donald,potato,isCaptain}));
    }

}
