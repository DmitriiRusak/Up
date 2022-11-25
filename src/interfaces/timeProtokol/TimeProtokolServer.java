package interfaces.timeProtokol;

import java.time.LocalDateTime;

public interface TimeProtokolServer {
    static void localTime() {
        while (true) {
            try {
                Thread.sleep(5000);
                System.out.println(LocalDateTime.now());

            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
interface TTT extends TimeProtokolServer{
    static void localTime(){
        System.out.println("Beleberda");
    }

}