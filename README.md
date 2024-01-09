 # Adapter Pattern 

Little Kata in java to practise easily the implementation of Adapter pattern

We have an application where you can create a song or a fly lesson from Birds kata.Canary and kata.Sparrow. 

We need to add new “birds” a Bat, MagicPotato and Duck , but this classes can not be modify and they do not have the methods necessary to use our existing implantation.

You need to use the Adapter Pattern to find a solution.

## Getting Started

You have two different projects

AdapterPatternBefore Base code of the KATA

AdapterPatternAfter  Solution of the Kata

### Prerequisites

Eager to learn!!

## Running the tests

Test that show how you can create a song

```[java]

@Test
public void make_ALL_Birds_create_a_Melody() {

    kata.Bird isCaptain = new kata.Sparrow();
    kata.Bird canary = new kata.Canary();

    String song = canary.sing()+" "+isCaptain.sing();

    kata.Melody melody = new kata.Melody(song);
    kata.Melody melodyExpected = new kata.Melody("Melodious PIO PIO Chirp Chirp");

    melody.printMelody();

    assertEquals(melodyExpected.melody,melody.melody);
}

```

Test that show how you can create a Fly Lesson

```[java]
@Test
public void make_ALL_birds_teach_Flylessons(){

    kata.Bird isCaptain = new kata.Sparrow();
    kata.Bird canary = new kata.Canary();

    String lesson =canary.fly()+" "+isCaptain.fly();
    kata.FlyTime flylesson = new kata.FlyTime(lesson);
    kata.FlyTime flyLessonExpected = new kata.FlyTime("Flying like a canary Flying to steal your Bread");

    flylesson.printFlyLessons();

    assertEquals(flyLessonExpected.flyLesson,flylesson.flyLesson);
}

```


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management


## Authors

 **Laura Gonzalez** - [Laura](https://github.com/Lauragonfer)

