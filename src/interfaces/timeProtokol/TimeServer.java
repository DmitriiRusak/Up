package interfaces.timeProtokol;

public class TimeServer implements TTT{
    public void localTime(){
        System.out.println("A NYKA");
    }
    public static void main(String[] args) {
       TTT.localTime();
       TimeServer ts=new TimeServer();
       ts.localTime();
    }
}
