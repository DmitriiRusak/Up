package zadachi.s_knigi_shilda_glava_6;
// Напишите рекурсивный метод, отображающий строку задом наперед.

//blia ia dymal y menia ne polychitsia.
//Osnovnoi moment v lyboi rekyrsii eto yslovie ee zaversheniia!!! )))
public class Nomer_6 {
    public void zadomNaPered(String string, int count){
        if(count>=0){
            System.out.print(string.charAt(count)+" ");
            count--;
            zadomNaPered(string, count);
        }
    }

    public static void main(String[] args) {
        Nomer_6 ob=new Nomer_6();
        String strint="Privet";
        ob.zadomNaPered(strint,strint.length()-1);
    }
}
