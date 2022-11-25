package algoritms;

import java.util.Scanner;

//Zadacha: Длина Московской кольцевой автомобильной дороги —109 километров. Байкер стартует с нулевого
// километра МКАД и едет со скоростью 'v' километров в час. На какой отметке он остановится через 't' часов?
//Программа получает на вход значения v и t. Если v>0, то Вася движется в положительном направлении по МКАД,
// если же значение v<0, то в отрицательном.
//Программа должна вывести целое число от 0 до 108 — номер отметки, на которой остановится Вася.
//Metodami, ciklami, operatorami vetvleniia - POLZOVATSIA NELZIA.
//peremennaia 'v' mozzet soderzzat otricatelnie znacheniia.
public class Operator_Ostatok_Ot_Deleniia {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int v= scanner.nextInt();
        int t= scanner.nextInt();
        final int protiazzonnost_dorogi=109;
        int distance=v*t;
        System.out.println((distance+protiazzonnost_dorogi)%protiazzonnost_dorogi);
    }
}
// Esli delimoe chislo menshe delitelia to operator '%' vernet delimoe. <--V etom vsia syt zadachi.
//primer:
// -1 % 109= -1;
// 100 % 109=100;
// Vot etogo momenta ia ne znal. A znal tolko chto danni opereator vozvraschaet ostatok ot deleniia.


