import java.util.List;

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

        for (Bird bird: singersBirds) {
            melody += bird.sing()+" ";
        }
        return melody;
    }
}
