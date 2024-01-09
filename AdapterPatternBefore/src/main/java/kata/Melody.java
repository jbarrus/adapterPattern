package kata;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Melody {

    String melody;

    public Melody(String melody) {
        this.melody = melody;
    }

    public Melody(){
        melody = "";
    }

    public void printMelody (){

        System.out.println(melody);
    }

    public String createSong (Bird[] singersBirds){

        melody = Arrays.stream(singersBirds).map(Bird::sing).collect(Collectors.joining(" "));
        return melody;
    }
}
