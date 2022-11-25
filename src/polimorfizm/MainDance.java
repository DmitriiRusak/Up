package polimorfizm;

import java.util.Arrays;
import java.util.List;

public class MainDance {
    public static void main(String[] args) {
        Dancer dancer = new Dancer("Антон", 18);

        Dancer breakDanceDancer = new BreakDankDancer("Алексей", 19);// восходящее преобразование к базовому типу
        Dancer electricBoogieDancer = new ElectricBoogieDancer("Игорь", 20); // восходящее преобразование к базовому типу

        List<Dancer> discotheque = Arrays.asList(dancer, breakDanceDancer, electricBoogieDancer);
        for (Dancer d : discotheque) {
            d.dance();// полиморфный вызов метода
        }
    }
}
