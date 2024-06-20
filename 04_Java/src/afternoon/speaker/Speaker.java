package afternoon.speaker;

public class Speaker {
    private int volume;
    private int MAX_VOULUME = 100;
    private int MIN_VOULUME = 0;


    public Speaker() {
        this.volume = 20;

    }

    public void volumeUp () {
        if (isValidVolumeUp()) {
            this.volume++;
            System.out.println("볼륨이 1 증가하였습니다.: " + this.volume);
        } else {
            printLimit();
        }
    }

    public void volumeDown () {
        if (isValidVolumeDown()) {
            this.volume--;
            System.out.println("볼륨이 1 감소하였습니다." + this.volume);
        } else {
            printLimit();
        }
    }

    public void mute() {
        this.volume = 0;
        System.out.println("스피커가 Mute 되었습니다. : " + this.volume);
    }

    public int getVolume() {
        return this.volume;
    }

    private boolean isValidVolumeUp() {
        return volume < MAX_VOULUME;
    }

    private boolean isValidVolumeDown(){
        return volume > MIN_VOULUME;
    }

    private void printLimit() {
        System.out.println("더이상 볼륨 조절이 불가능합니다.");
    }


}
