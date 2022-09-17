package practice._11AbstractionInterfacePolymorh;

interface TvRemote{
    void changeTheChannel(int channelNumber);
    void IncreaseSound();
    void DecreaseSound();
    void PreviousChannel();
    void NextChannel();
    void TurnOnTv();
    void TurnOffTv();
}

interface SmartTvRemote extends TvRemote{
    void SearchApp();
    void LaunchYT();
}

public class _6SmartTv {
    public static void main(String[] args) {
        System.out.println("--Task is inherite a method of interface--");
    }
}
