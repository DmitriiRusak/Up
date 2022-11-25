package rekyrsiia;

public class RekytsiiaPrimerDva {
    static int a=0;
    static void anstopable(){
        System.out.println(a++);
        if(a==14000){
            return;
        }else anstopable();
     }
    public static void main(String[] args) {
        anstopable();




    }
}
