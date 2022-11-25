package zadachi.s_knigi_shilda_glava_6;
// Создайте метод sum (), имеющий список аргументов переменной длины и
//предназначенный для суммирования передаваемых ему значений типа int .
//Метод должен возвращать результат суммирования. Продемонстрируйте работу этого метода.
public class Nomer_13 {
    public int sum(int ... variable){
        int sum=0;
        for(int i=0; i<variable.length;i++){
            sum+=variable[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        Nomer_13 nomer_13=new Nomer_13();
        nomer_13.sum(231, 532,735,5684,86,4);
    }
}
