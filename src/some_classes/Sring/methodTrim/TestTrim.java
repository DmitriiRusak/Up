package some_classes.Sring.methodTrim;

public class TestTrim {
    public static void main(String[] args) {


        String str = "      Senla, I am getting reade     ";
        System.out.println(str);
        System.out.println(str.trim());
        System.out.println(str);//<-ob`ekti String ne izmenni,deistvie metoda vremenno i neizme
        //niaet str
        String str1=str.trim();// Tak sozdaem novii ob`ekt. i se rabotaet...)
        System.out.println(str1);

    }
}