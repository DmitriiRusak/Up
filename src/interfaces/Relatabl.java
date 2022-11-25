package interfaces;

import java.time.LocalDateTime;

public interface Relatabl {
    public void isLargeThan(Relatabl other);

    default LocalDateTime getTime(){
        LocalDateTime ldt=LocalDateTime.now();
        return ldt;
    }
    static void doNathing(){
        System.out.println("doing 'do Nathing' method");
    }
}
