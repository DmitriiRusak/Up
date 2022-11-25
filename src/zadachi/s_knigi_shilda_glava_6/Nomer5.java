package zadachi.s_knigi_shilda_glava_6;
//Предположим, имеется следующий класс:
//class Test {
//    int а;
//    Test ( int i) { а = i ; }
//    Напишите метод swap () , реал изующий обмен содержимым между двумя
//    объектами типа Test, на которые ссьлаются две переменные данного типа.
    public class Nomer5 {
    int a;

    Nomer5(int i){
        a=i;
    }

    public static void swap(Nomer5 ob1, Nomer5 ob2){
        int temp=ob1.a;
        ob1.a=ob2.a;
        ob2.a=temp;
    }

    public static void main(String[] args) {
        Nomer5 ob1=new Nomer5(1);
        Nomer5 ob2=new Nomer5(2);
        System.out.println("ob1.a= "+ob1.a+"; "+"ob2.a= "+ob2.a);
        Nomer5.swap(ob1, ob2);
        System.out.println("ob1.a= "+ob1.a+"; "+"ob2.a= "+ob2.a);
    }
}
