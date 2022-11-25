package algoritms;

import java.util.Scanner;

public class Pirozzok {
    public static void main(String[] args) {
//Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.
//Программа получает на вход три числа: a, b, n.
//Программа должна вывести два числа: стоимость покупки в рублях и копейках. Bez ciklov i ifov.
        Scanner sc = new Scanner(System.in);
        int stoimost_pirozzka_v_rybliax = sc.nextInt();
        int kopeiki = sc.nextInt();
        int pirozzkov = sc.nextInt();
        System.out.println((stoimost_pirozzka_v_rybliax*pirozzkov+((kopeiki*pirozzkov)/100))+" "+(kopeiki*pirozzkov)%100);

//stoimost_pirozzka_v_rybliax*pirozzkov+((kopeiki*pirozzkov)/100)) <--tyt delim na 100 tak-kak xotim poniat skolko ryblei polychilos pri
//slazzivanii kopeek. Po ysloviy zze nado ykazat kopeiki i ryblia otdelno, i bydet nekorrektno vivesti, k primery, 2 ryb. i  140 kopeek )))
// otvet dolzzen bit: 3 ryb. 40 kopeek.
    }
}
