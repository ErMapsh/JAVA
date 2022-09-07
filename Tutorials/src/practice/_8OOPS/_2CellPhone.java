package practice._8OOPS;

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }

    public void vibrate(){
        System.out.println("Vibrating...");
    }

    public void CallingFriend(){
        System.out.println("Call the ErMapsh...");
    }
}

public class _2CellPhone {
    public static void main(String[] args) {
        CellPhone redmi = new CellPhone();
        redmi.ring();
        redmi.vibrate();
        redmi.CallingFriend();
    }   
}
