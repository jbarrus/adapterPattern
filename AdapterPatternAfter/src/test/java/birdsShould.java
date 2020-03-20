import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class birdsShould {

    @Test
    public void make_ALL_Birds_create_a_Melody() {

        Bird isCaptain = new Sparrow();
        Bird canary = new Canary();

        Bird batsy = new BatAdapter(new Bat());
        Bird donald = new DuckAdapter(new Duck());
        Bird potato = new MagicPotatoAdapter(new MagicPotato());

        String song = batsy.sing() + " " + canary.sing() + " " + donald.sing() + " " + potato.sing() + " " + isCaptain.sing();

        Melody melody = new Melody(song);
        Melody melodyExpected = new Melody("I am the Night Melodious PIO PIO Cuack Cuack Magic potato RULES Chirp Chirp");

        melody.printMelody();

        assertEquals(melodyExpected.melody,melody.melody);
    }

    @Test
    public void make_ALL_Birds_create_a_Melody_BY_list() {

        Bird isCaptain = new Sparrow();
        Bird canary = new Canary();

        Melody melody = new Melody();
        melody.createSong(new Bird[] {canary,isCaptain});

        Melody melodyExpected = new Melody("Melodious PIO PIO Chirp Chirp ");

        melody.printMelody();

        assertEquals(melodyExpected.melody,melody.melody);
    }

    @Test
    public void make_ALL_birds_teach_Flylessons(){

        Bird isCaptain = new Sparrow();
        Bird canary = new Canary();

        Bird batsy = new BatAdapter(new Bat());
        Bird donald = new DuckAdapter(new Duck());
        Bird potato = new MagicPotatoAdapter(new MagicPotato());

        String lesson = batsy.fly()+" "+canary.fly()+" "+donald.fly()+" "+potato.fly()+" "+isCaptain.fly();
        FlyTime flylesson = new FlyTime(lesson);
        FlyTime flyLessonExpected = new FlyTime("Fliying in the Darkness Flying like a canary Flying more or less rolling potato Flying to steal your Bread");

        flylesson.printFlyLessons();


        assertEquals(flyLessonExpected.flyLesson , flylesson.flyLesson);
    }

    @Test
    public void make_ALL_birds_teach_Flylessons_BY_list(){

        Bird isCaptain = new Sparrow();
        Bird canary = new Canary();

        FlyTime flylesson = new FlyTime();
        flylesson.createFlylesson(new Bird[] {canary,isCaptain});

        FlyTime flyLessonExpected = new FlyTime("Flying like a canary Flying to steal your Bread ");

        flylesson.printFlyLessons();

        assertEquals(flyLessonExpected.flyLesson,flylesson.flyLesson);
    }

    @Test
    public void create_a_Melody() {

        Bird isCaptain = new Sparrow();
        Bird canary = new Canary();

        Bird batsy = new BatAdapter(new Bat());
        Bird donald = new DuckAdapter(new Duck());
        Bird potato = new MagicPotatoAdapter(new MagicPotato());

        Melody melody = new Melody();
        Melody melodyExpected = new Melody("I am the Night Melodious PIO PIO Cuack Cuack Magic potato RULES Chirp Chirp");

        assertEquals( melody.createSong(new Bird[]{isCaptain, canary, batsy, donald, potato}),melody.melody);
    }

    @Test
    public void teach_Flylessons(){
        Bird isCaptain = new Sparrow();
        Bird canary = new Canary();

        Bird batsy = new BatAdapter(new Bat());
        Bird donald = new DuckAdapter(new Duck());
        Bird potato = new MagicPotatoAdapter(new MagicPotato());

        FlyTime flylesson = new FlyTime();
        FlyTime flyLessonExpected = new FlyTime("Fliying in the Darkness Flying like a canary Flying more or less rolling potato Flying to steal your Bread ");

        assertEquals(flyLessonExpected.flyLesson , flylesson.createFlylesson(new Bird [] {batsy,canary,donald,potato,isCaptain}));
    }

}
