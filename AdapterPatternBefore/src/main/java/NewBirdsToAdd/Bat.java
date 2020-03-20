package NewBirdsToAdd;

public class Bat {

    private int singOk;
    private int flyOk;

    public Bat() {
        this.flyOk = 0;
        this.singOk =0;
    }


    public String fly() {
        if (flyOk == 3){
            flyOk = 0;
            return "Fliying in the Darkness";
        }
        flyOk = 0;
        return "";
    }

    public void stopSing(){

        flyOk ++;
    }

    public void startToRun(){
        flyOk ++;
    }

    public void warmWings(){
        flyOk ++;
    }


    public String makeSound() {
        if (singOk == 3){
            singOk = 0;
            return "I am the Night";
        }
        singOk = 0;
        return "";

    }

    public void stopFlying(){
        singOk ++;
    }

    public void sitDown(){
        singOk ++;
    }

    public void warmVoice(){
        singOk ++;
    }

}