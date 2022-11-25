package algoritms;
//Улитка ползёт по вертикальному шесту высотой 'h' метров, поднимаясь за день на 'a' метров, а за ночь спускаясь на 'b' метров. На какой день улитка доползёт
// до вершины шеста? Программа получает на вход натуральные числа 'h', 'a', 'b'. Гарантируется, что a>b.
//Программа должна вывести одно натуральное число.
//primer:
// inpyt 10, 3, 2. Output 8;
// inpyt 20, 7, 3. Output 5;
public class Ylitka {
    public static void main(String[] args) {
        int h=20;
        int a=7;
        int b=3;

//        int h=10;
//        int a=3;
//        int b=2;

//Otnimem ot vsei dlinni kolichestvo metrov na kotoroe ylitka spolzaet vniz noch`y. A zachem? Ia ne ponimay pochemy nada otnimat imenno
// nochnoe kolichestvo metrov. Podymaem vmeste...
// ylitka propolzla 7 metrov iz 20 (eto 1-ii den), prishla noch i ylitka spolzla i na ytro naxoditsia na 4-x metrax iz 20.
// v techenie etogo dnia ona propolzla esche 7 metrov (4+7=11) i naxoditsia na otmetke 11 metrov (eto 2-ii den), noch`y spystilas na 8 metrov
// v sledyyschii den ona propolzla esche 7 metrov (8+7=15) i naxoditsia na otmetke 15 metrov (eto 3-ii den), noch`y spystilas na 12 metrov
// v sledyyschii den ona propolzla esche 7 metrov (12+7=19) i naxoditsia na otmetke 19 metrov (eto 4-ii den), noch`y spystilas na 16 metrov
// na ytro 5-go dnia ylitka naxoditsia na 16 metrax i v techenie etogo dnia ona propolzet +7 metrov i dostignet verxa. potrativ na eto 5 dnei.
        int rezult= (((h-b)-1) / (a-b)) + 1;
        System.out.println(rezult);


    }
}
