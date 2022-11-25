package algoritms;

import java.util.Arrays;

public class NumberToArray {
    public static void main(String[] args) {

        aVoid(12345678);
    }

    public static void aVoid(int number) {
        int len = String.valueOf(Math.abs(number)).length();//<--opredelenie kolichestva cifr v number.
//Polychaem stroky ispolzyia String.valueOf (int a), etot metod vozvroschaet String-ovoe predstavlenie inta, no
//esli vxodiaschii int bydet otricatelnim to nelzia bydet ispolzovat instrykciy .length, tak-kak ona vernet
//na odin simvol bolshe chem cifr v int-e(t.e. skolko cifr v int, stolko i simvolov v Stringe, a esli chislo
// otricatelnoe to + 1 simvol na znak mintsa'-'). Poetomy preobrozyem nash int s
// pomoschy Math.abs(int a), on vozvraschaet int esli emy peredat otricatelnii ili polozzitelnii int. Zatem, po-
//lychiv chislo v vide String i znaia chto tam net znaka minys, ispolzyem instrykciy .length, tem samim yznaem
//kolichestvo cifr v nashei String (odna cifra==1 simvoly) i mozzem ispolzovat eto pri opredelenii dlinni
// massiva.

        int temp_number = Math.abs(number);//создать vremennyy переменную для теста
        int[] a1 = new int[len];//создать массив с длинной указанной в len

        for (int i = len - 1; i > -1; i--){//заполнить массив с конца, takim obrazom rabotaet algoritm naxozzdeniia
//ostatka ot delenia na 10.T.e. ostatok ot deleniia na '10' naxoditsia v konce chisla, sootvetstvenno i nam nyzzno
// zapisivat nashe chislo s prava na levo (kak bi s konca), poetomt i cikl gonim s konca v nachalo, zapisivaia kazzdii
// raz ostatok ot deleniia v poslednii index massiva

            a1[i] = temp_number%10;//присвоить остаток от деления этому числу

            //temp_number -= (temp_number%10);//остаток от деления записать в последний элемент массива, потом в пред последний и тд
            temp_number /= 10;//разделить число на 10 что бы дальше считать остатки от деления, pri etom ostatok, kotorii
//mi zapisali v a1[i] teriaetsia (vibrasivaetsia).
            System.out.println(temp_number);//чисто показать результат выполнения
        }
        System.out.println(Arrays.toString(a1));//показать готовый массив
    }
}
