package some_classes.arrays.Stream;

import java.util.stream.Collectors;

public class Dlai_Razbora {
    public static void main(String[] args) {
        String str="Blagopriiatnii";
        int s= (int)str.toLowerCase().chars().boxed().collect(Collectors.groupingBy(k->k,Collectors.counting())).values().stream().filter(e->e>1).count();
//-----------------------------------------------------------------------------------------------------------------------------------------------------------
    }
}
