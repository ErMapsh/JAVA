package practice._11AbstractionInterfacePolymorh;

interface TvRemote1 {
    void changeTheChannel(int channelNumber);

    void IncreaseSound();

    void DecreaseSound();

    void PreviousChannel();

    void NextChannel();

    void TurnOnTv();

    void TurnOffTv();
}

interface SmartTvRemote1 extends TvRemote1 {
    void SearchApp();

    void LaunchYT();
}

class Tv implements SmartTvRemote1 {

    @Override
    public void changeTheChannel(int channelNumber) {
        System.out.println("Change the channel to " + channelNumber);
    }

    @Override
    public void IncreaseSound() {
        System.out.println("Increase sound by 1...");
    }

    @Override
    public void DecreaseSound() {
        System.out.println("Decrease sound by 1...");
    }

    @Override
    public void PreviousChannel() {
        System.out.println("Previous channel...");
    }

    @Override
    public void NextChannel() {
        System.out.println("Next channel...");
    }

    @Override
    public void TurnOnTv() {
        System.out.println("Turn on tv...");
    }

    @Override
    public void TurnOffTv() {
        System.out.println("Turn off tv...");
    }

    @Override
    public void SearchApp() {
        System.out.println("Searching application... ");
    }

    @Override
    public void LaunchYT() {
        System.out.println("Youtube launching...");
    }
}

public class _7ClassTv {
    public static void main(String[] args) {
        Tv lg = new Tv();
        lg.TurnOnTv();
    }
}
